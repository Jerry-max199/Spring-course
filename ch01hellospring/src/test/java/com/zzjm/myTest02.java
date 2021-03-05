package com.zzjm;

import com.zzjm.ba02.Student;
import com.zzjm.ba02.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest02 {
    @Test
    public void text06(){
        System.out.println("测试student类的赋值");
        Student student=new Student();
        student.setName("lisi");
        student.setAge(22);
        student.setEmail("555@qq.com");

        School school=new School();
        school.setName("字节跳动");
        school.setAddress("北京");
        student.setShool(school);
        System.out.println(student);
    }
    @Test
    public void testStudent(){
        String config="ba01/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student) applicationContext.getBean("mystudent");
        System.out.println(student);
    }
    @Test
    public void testStudentmethoud(){
        String config="ba01/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student) applicationContext.getBean("Student");
        System.out.println(student);
    }
    @Test
    public void testStudentindex(){
        String config="ba01/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student) applicationContext.getBean("Students");
        System.out.println(student);
    }
}
