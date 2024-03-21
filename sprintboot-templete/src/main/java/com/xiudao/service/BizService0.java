package com.xiudao.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author xiudao
 * @date 2022/12/13
 */
@Service
public class BizService0 {

    @Autowired
    private BizService1 bizService1;

    @Autowired
    private BizService2 bizService2;

    @Autowired
    private BizService3 bizService3;

    @Value("${xiudao.name}") // 注入application.properties中的变量
    private String name;

    @PostConstruct
    public void init(){
        System.out.println(name);
        bizService1.run();
        bizService2.run2();
        bizService3.run3();
    }
}
