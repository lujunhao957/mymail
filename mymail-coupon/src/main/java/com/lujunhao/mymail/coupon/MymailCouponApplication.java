package com.lujunhao.mymail.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lujunhao.mymail.coupon.dao")
@SpringBootApplication
public class MymailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailCouponApplication.class, args);
    }

}
