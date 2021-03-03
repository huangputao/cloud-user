package com.example.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描mybatis哪些包里面的接口
@MapperScan("com.example.springcloud.mapper")
@SpringBootApplication
public class SpringcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUserApplication.class, args);
    }


}
