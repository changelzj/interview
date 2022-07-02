package org.example.interview.runtime;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestOOM {

    
    public static void main(String[] args) {
        //StackOverflowError();
        //heapSpaceError();
        //headlimit();
        //directBufferMemory();
        //thread();
        meta();
    }
    
    //-Xss20m
    public static void stackOverflowError() {
        stackOverflowError();
    }

    //-Xms10m -Xmx10m -XX:+PrintGCDetails
    public static void heapSpaceError() {
        byte[] b = new byte[40*1024*1024];
    }
    
    
    
    // -Xms10m -Xmx10m -XX:+PrintGCDetails
    // 超过了98%的时间做垃圾回收，回收了不到2%的内存
    public static void headlimit() {
        
        List<String> list = new ArrayList<>();
        int i=0;
        try {
            while (true) {
                list.add(String.valueOf(i++).intern());
            }
        } catch (Throwable e) {
            System.out.println(i+" ******************");
            e.printStackTrace();
        }
    }
    
    
    // -XX:MaxDirectMemorySize=5m
    public static void directBufferMemory() {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(20 * 1024 * 1024);
    }
    
    
    public static void thread() {
        while (true) {
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        
    } 
    
    // -XX:MaxMetaspaceSize=8m
    public static void meta() {
        
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Object.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) 
                        throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });
            enhancer.create();
        }
        
        
        
    }
    
    
}
