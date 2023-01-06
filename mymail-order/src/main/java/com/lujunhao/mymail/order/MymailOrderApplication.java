package com.lujunhao.mymail.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.lujunhao.mymail.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MymailOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailOrderApplication.class, args);
    }

}
