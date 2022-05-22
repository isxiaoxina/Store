package com.cxxx.store.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cxxx.store.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class StoreMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreMemberApplication.class, args);
    }

}
