package org.example.algorithm.sort;

/**
 * @Author DongLiusuo
 * @create 2020/6/2 21:01
 *
 * 定义一个学生类Student，具有年龄age和username两个属性，并通过Comparable接口提供比较规则
 */
public class Student implements Comparable<Student> {

    private String username;

    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
