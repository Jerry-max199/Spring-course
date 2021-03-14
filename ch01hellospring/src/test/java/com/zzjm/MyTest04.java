package com.zzjm;

import com.zzjm.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void test04(){
        String config="ba04/total.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student)applicationContext.getBean("mystudent");
        System.out.println(student);
    }
}
