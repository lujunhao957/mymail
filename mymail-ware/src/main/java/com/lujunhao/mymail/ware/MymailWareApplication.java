package com.lujunhao.mymail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.lujunhao.mymail.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MymailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailWareApplication.class, args);
    }

}
