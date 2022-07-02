package org.example.interview.test2;

public class Son extends Father {
    private int i = test();
    private static int j = method();
    
    static {
        System.out.println(6);
    }
    
    Son() {
        System.out.println(7);
    }
    
    {
        System.out.println(8);
    }
    
    public int test() {
        System.out.println(9);
        return 1;
    }

    public static int method() {
        System.out.println(10);
        return 1;
    }

    /**
     * 类的初始化：
     * 执行main方法，main方法所在的类要先加载和初始化
     * new类的对象导致类加载和初始化
     * 
     * 一个子类初始化会先初始化父类
     * 
     * 一个类初始化就是执行<clinit>(字节码中)方法，只执行一次，
     * 由静态的类变量和静态代码块组成，类变量和静态代码块由上向下执行
     * 
     * ////////////////////////////////////
     * 
     * 实例的初始化：
     * 执行<init>(字节码中)方法，<init>由非静态实例变量显式赋值代码块，非静态代码块，和构造器组成
     * 
     * <init>可能有多个，有几个构造器就有几个<init>
     *     
     * 每次创建实例，调用对应的构造器，对应的<init>就会执行，执行时首先执行父类的<init>，
     * 然后非静态实例变量显式赋值代码块与非静态代码块，按照上下顺序执行，最后执行对应的构造器
     * 
     * ///////////
     * 
     * 方法的重写：
     * 
     * 
     * 不能被重写：静态方法, final方法, private修饰的不可见的方法
     * 
     * 对象的多态性：
     * 子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的方法
     * 非静态方法调用前都有一个默认的对象this，在构造器或<init>中的this表示正在被创建的对象
     */
    public static void main(String[] args) {
        Son s1 = new Son();//
        System.out.println();
        Son s2 = new Son();
    }
}



