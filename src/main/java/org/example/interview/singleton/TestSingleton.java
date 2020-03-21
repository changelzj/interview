package org.example.interview.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        //System.out.println(Singleton3.INSTANCE);
        //System.out.println(Singleton3.INSTANCE);
        for (int i = 0; i < 20000; i++) {
            new Thread(() -> {
                Singleton2 instance = Singleton2.getInstance();
            }).start();
        }
    }
}
