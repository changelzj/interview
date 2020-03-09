package org.example.interview.recursive;

/**
 * 有 n 步台阶，一次只能上一步或两步，有几种走法
 */
public class Test {
    public static int f(int x) {
        if (x == 1) {
            return 1;
        }
        
        if (x == 2) {
            return 2;
        }
        
        return f(x - 2) + f(x - 1);
    }

    public static void main(String[] args) {
        //System.out.println(f(3));
        System.out.println(loop(5));
    }
    
    public static int loop(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return  2;
        }
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <= x; i++) {
            sum = two + one;
            one = two;
            two = sum;
        }
        return sum;
    }
}
