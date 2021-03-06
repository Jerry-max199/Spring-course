package com.zzjm.ba01;

import com.zzjm.ba02.School;

public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("---先执行无参构造");
    }
    public void setEmail(String email){
        System.out.println("email是"+email);
    }
    //必须要有set方法；，不然会报错；spring只执行set方法，具体赋值由你自己执行

   public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setShool(School school) {
    }
}

