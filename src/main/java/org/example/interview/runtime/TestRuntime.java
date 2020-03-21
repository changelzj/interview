package org.example.interview.runtime;

public class TestRuntime {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU:" + runtime.availableProcessors());
        System.out.println("-Xmx JVM试图使用的最大堆内存" + runtime.maxMemory()/1024/1024);
        System.out.println("-Xms JVM中的堆内存总量" + runtime.totalMemory()/1024/1024);
    }
}
