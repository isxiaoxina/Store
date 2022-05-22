package com.cxxx.store.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cxxx.store.ware.feign")//扫描这个包下面的服务
@EnableDiscoveryClient//springcloud的注册中心
@SpringBootApplication
public class StoreWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreWareApplication.class, args);
    }

}
