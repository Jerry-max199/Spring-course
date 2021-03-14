package com.zzjm;

import com.zzjm.ba03.Student;
import com.zzjm.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test02(){
        String config="ba03/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student=(Student)applicationContext.getBean("mystudent");
        System.out.println(student);
    }
}
