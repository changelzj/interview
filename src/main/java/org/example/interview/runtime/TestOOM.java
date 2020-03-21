package org.example.interview.runtime;

public class TestOOM {
    public static void main(String[] args) {
        byte[] b = new byte[40*1024*1024];
    }
}
