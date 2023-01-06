package com.lujunhao.mymail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.lujunhao.mymail.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class MymailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailCouponApplication.class, args);
    }

}
