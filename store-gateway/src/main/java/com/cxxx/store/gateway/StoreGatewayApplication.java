package com.cxxx.store.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
/**
 * 开启springcloud服务注册发现
 */
@EnableDiscoveryClient
//由于没用数据库  排除数据库的自动配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StoreGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreGatewayApplication.class, args);
    }

}
