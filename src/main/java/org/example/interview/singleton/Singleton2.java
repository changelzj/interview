package org.example.interview.singleton;

/**
 * 懒汉单例，线程安全，高效
 */
public class Singleton2 {
    
    private static volatile Singleton2 singleton = null;
    
    private Singleton2() {
        System.out.println("Singleton2 构造");
    }
    
    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
