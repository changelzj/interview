package org.example.interview.singleton;

/**
 * 静态内部类懒汉式单例，线程安全
 * 原理：静态内部类不会随着外部类的加载而加载,使用时才会加载，内部类加载才会创建内部类对象
 */
public class Singleton4 {
    
    private Singleton4() {
        
    }
    
    private static class Inner {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Inner.INSTANCE;
    }
    
    
    
}
