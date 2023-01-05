package com.lujunhao.mymail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lujunhao.mymail.member.dao")
@SpringBootApplication
public class MymailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailMemberApplication.class, args);
    }

}
