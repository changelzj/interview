package org.example.interview.test1;

/**
 * 局部变量和成员变量的区别
 *
 * 
 * 局部变量：存在于方法体，形参，代码块中，只能使用final修饰
 * 成员变量：可以使用private protect public final static volatile transient修饰，
 * 
 * 局部变量存放于栈，实例变量存放于堆，静态变量(类变量)存放在方法区
 * 
 * 局部变量每个线程每一次调用执行，都是新的生命周期
 * 实例变量随着对象的创建而初始化，随着对象的回收而消亡，每一个对象的实例变量是独立的
 * 类变量随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的
 * 
 * 成员变量有默认值，局部变量没有默认值
 * 
 * JVM的内存分配
 * 
 * 堆：对象的实例和数组
 * 
 * 虚拟机栈：局部变量，对象引用
 * 
 * 方法区：以已被虚拟机加载的类信息，常量，静态变量，即时编译后的代码
 * 
 */
public class Exam2 {
    static int s;
    int i;
    int j;
    {
        int i = 1;
        i++;
        j++;
        s++;
    }
    public void test(int j) {
        i++;
        j++;
        s++;
    }

    public static void main(String[] args) {
        Exam2 obj1 = new Exam2(); // i0 j1 s1
        Exam2 obj2 = new Exam2(); // i0 j1 s2

        obj1.test(10);// i1 j1 s3
        obj1.test(20);// i2 j1 s4
        
        obj2.test(30);//i1 j1 s5
        
        //obj1 i2 j1 s5

        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.s);

        System.out.println(obj2.i);
        System.out.println(obj2.j);
        System.out.println(obj2.s);
    }
}
