package org.example.interview.test1;

public class Exam1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++; // i2 j1
        int k = i + ++i * i++; //先从左向右压栈，在按照优先级计算
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
