package com.zzjm.ba03;

public class Student {
    private String name;
    private int age;
    //声明一个引用类型属性
    private School school;


    public void setName(String name) {

        this.name = name.toUpperCase();
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSchool(School school) {
        System.out.println("setSchool"+school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }


}

