package org.example.interview.runtime;

import sun.misc.VM;

public class TestRuntime {
    //-Xms1024m -Xmx1024m -XX:MaxDirectMemorySize=2g -XX:+PrintGCDetails 
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU:" + runtime.availableProcessors());
        System.out.println("-Xmx JVM堆内存初始 " + runtime.maxMemory()/1024/1024);
        System.out.println("-Xms JVM堆内存最大 " + runtime.totalMemory()/1024/1024);
        System.out.println("JVM能用到的最大直接内存 " + VM.maxDirectMemory() /1024/1024);
    }
}
