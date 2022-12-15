package com.alibaba.xiudao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@Configuration
@ImportResource(locations = {"classpath:spring.xml"}) // 引入外部的xml配置文件
@SpringBootApplication // 自动扫描当前包，以及子包下面的注解  TODO 注解学习
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}