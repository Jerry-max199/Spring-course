package com.zzjm.service.impl;

import com.zzjm.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public  SomeServiceImpl(){
        System.out.println("构造方法执行了");
    }
    @Override
    public void doSome() {
        System.out.println("执行了someServiceImpl的dosome（）方法");
        System.out.println("执行了someServiceImpl的dosome（）方法");
        System.out.println("执行了someServiceImpl的dosome（）方法");
    }
}
