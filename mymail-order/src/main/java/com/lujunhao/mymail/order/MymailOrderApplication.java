package com.lujunhao.mymail.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lujunhao.mymail.order.dao")
@SpringBootApplication
public class MymailOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailOrderApplication.class, args);
    }

}
