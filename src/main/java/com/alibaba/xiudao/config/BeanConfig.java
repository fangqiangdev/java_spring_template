package com.alibaba.xiudao.config;

import com.alibaba.xiudao.service.BizService1;
import com.alibaba.xiudao.service.BizService2;
import com.alibaba.xiudao.service.BizService3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xiudao
 * @date 2022/12/14
 */
@Configuration // 替代传统的xml配置文件
@EnableAspectJAutoProxy(proxyTargetClass = true) // aop时无论是否有接口都使用 glibc （如果有接口默认使用 jdk动态代理）
public class BeanConfig {

    @Bean(initMethod = "init") // 替代传统的xml文件中的bean配置
    public BizService3 bizService3(@Autowired BizService2 bizService2){ // 参数会通过bean 自动注入
        return new BizService3();
    }
}
