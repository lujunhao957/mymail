package com.lujunhao.mymail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MymailGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymailGatewayApplication.class, args);
    }

}
