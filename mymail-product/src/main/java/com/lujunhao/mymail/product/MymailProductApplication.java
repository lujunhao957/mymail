package com.lujunhao.mymail.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lujunhao.mymail.product.dao")
@SpringBootApplication
public class MymailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailProductApplication.class, args);
    }

}
