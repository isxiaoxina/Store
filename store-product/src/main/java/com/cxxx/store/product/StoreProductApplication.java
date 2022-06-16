package com.cxxx.store.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1整合mybatis-plus 依赖
 * 2配置
 *   1)配置数据源：
 */
@EnableDiscoveryClient//开启服务注册发现
@MapperScan("com.cxxx.store.product.dao")
@SpringBootApplication
public class StoreProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreProductApplication.class, args);
    }

}
