package org.example.interview.fun;

import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 2;
        int[] arr = {1,2,3,4,5};
        MyData data = new MyData();

        change(i, str, num, arr, data);
        
        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(data);
    }

    /**
     * 基本数据类型传值，引用数据类型传地址
     * String和包装类型的对象不可变
     */
    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
    
}



