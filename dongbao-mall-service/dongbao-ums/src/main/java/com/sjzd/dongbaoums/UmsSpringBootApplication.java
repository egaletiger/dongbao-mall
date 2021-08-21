package com.sjzd.dongbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sjzd.dongbaoums.mapper")
public class UmsSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(UmsSpringBootApplication.class, args);
    }
}
