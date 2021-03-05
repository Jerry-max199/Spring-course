package com.zzjm;

import com.zzjm.ba01.Student;
import com.zzjm.service.SomeService;
import com.zzjm.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service=new SomeServiceImpl();
            service.doSome();
    }
    //spring创建对象的时间是在创建spring容器时，会创建配置文件的所有对象
    //spring创建对象时默认调用的是无参构造方法。
    @Test
    public void test02(){
    //使用spring容器创建对象
    //指定spring配置文件的名称
    String config="beans.xml";
    //创建表示spring容器的对象，ApplicationContext
    //ApplicationContext就是表示Spring容器，通过容器获取对象
    //ClassPathXmlApplicationContext：表示从类路径中加载spring的配置文件。
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
    //从容器中获取某个对象，你要调用对象的方法
    SomeService service1=(SomeService) applicationContext.getBean("service");
    service1.doSome();
}
/**
 * 获取spring容器中的java对象的信息
 */
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        int numbers=applicationContext.getBeanDefinitionCount();
        System.out.println("容器中定义对象的数量"+numbers);
        //容器中定义类的名称
        String names[] =applicationContext.getBeanDefinitionNames();
        for(String name:names) {
            System.out.println("容器中定义类的名称" + name);
        }
    }
    //获取一个非自定义类的对象
    @Test
    public void text04(){
        String config="beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        //获取对象使用getBean();
        Date myDate=(Date) applicationContext.getBean("mydate");
        System.out.println("获取当前系统时间"+myDate);
    }
    @Test
    public void text05(){
        String config="ba01/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        //获取对象使用getBean();
        Student mystudent=(Student) applicationContext.getBean("student");
        System.out.println("student对象"+mystudent);
        Date mydate=(Date)applicationContext.getBean("mydate");
        System.out.println(mydate);

    }

}