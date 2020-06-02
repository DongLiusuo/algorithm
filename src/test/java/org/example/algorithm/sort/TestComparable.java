package org.example.algorithm.sort;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:07
 *
 * 定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
 */
public class TestComparable {


    public static Comparable getMax(Comparable c1,Comparable c2) {
        int result = c1.compareTo(c2);
        //如果 result<0 , 则c1<c2
        //如果 result>0 , 则c1>c2
        //如果 result==0 , 则c1==c2
        if (result>=0) {
            return c1;
        }
        return c2;
    }

    public static void main(String[] args) {
        //创建两个Student对象，并调用getMax()方法，完成测试
        Student s1 = new Student();
        s1.setAge(18);
        s1.setUsername("张三");
        Student s2 = new Student();
        s2.setAge(22);
        s2.setUsername("李四");
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }
}
