package com.zzjm.ba02;

public class Student {
    private String name;
    private int age;
    //声明一个引用类型属性
    private School school;

    public Student(){
        System.out.println("---先执行无参构造");
    }

    /**
     * 创建一个有参构造
     * @param email
     *
     */
    public Student(String name,int age,School myschool){
        System.out.println("这是一个有参构造方法");
        this.name=name;
        this.age=age;
        this.school=myschool;
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
                ", school=" + school +
                '}';
    }

    public void setShool(School school) {
        System.out.println("setSchool"+school);
        this.school = school;
    }
}

