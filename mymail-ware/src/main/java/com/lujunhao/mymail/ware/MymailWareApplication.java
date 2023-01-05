package com.lujunhao.mymail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lujunhao.mymail.ware.dao")
@SpringBootApplication
public class MymailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailWareApplication.class, args);
    }

}
