package com.gao.study.idea.springbooteurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbooteurekademoApplication {

    public static void main(String[] args) {
        System.out.println("开始启动服务");
        SpringApplication.run(SpringbooteurekademoApplication.class, args);
        System.out.println("服务启动成功");
    }

}
