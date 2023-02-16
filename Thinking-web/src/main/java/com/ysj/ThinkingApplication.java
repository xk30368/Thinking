package com.ysj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ysj.domain.mapper")
public class ThinkingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThinkingApplication.class, args);
    }
}
