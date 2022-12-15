package com.alibaba.xiudao.service;

import javax.annotation.PostConstruct;

import com.alibaba.xiudao.service.intf.BizService;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @author xiudao
 * @date 2022/12/13
 */
@Service
@DependsOn("bizService2")
public class BizService1  implements BizService {
    @PostConstruct
    public void init(){
        System.out.println("init " + this.getClass().getSimpleName());
    }

    @Override
    public void run(){
        System.out.println("run " + this.getClass().getSimpleName());
    }
}
