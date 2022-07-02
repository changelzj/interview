package org.example.interview.singleton;

/**
 * 饿汉式单例
 */
public class Singleton {
    
    public static final Singleton INSTANCE = new Singleton();
    
    private Singleton() {
        
    }
    
}
