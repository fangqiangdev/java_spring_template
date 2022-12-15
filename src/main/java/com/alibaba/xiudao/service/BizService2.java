package com.alibaba.xiudao.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiudao
 * @date 2022/12/13
 */
public class BizService2 {

    public void init(){
        System.out.println("init " + this.getClass().getSimpleName());
    }

    public void run2(){
        System.out.println("run " + this.getClass().getSimpleName());
    }
}
