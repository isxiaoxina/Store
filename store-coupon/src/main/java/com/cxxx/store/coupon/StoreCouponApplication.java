package com.cxxx.store.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用Nacos作为配置
 * 1引入依赖
 *  <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *  2创建bootstrap.properties
 *  spring.application.name=store-coupon
 * #spring微服务 配置中心地址  管理所有
 * spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3需要给nacos控制台添加 数据集（Data Id）默认规则 应用名.properties
 * 4添加配置 在控制台里面
 * 5RefreshScope  动态刷新配置
 * @Value (${名字})获取配置
 * 以配置中为准配置
 */
@EnableDiscoveryClient
@MapperScan("com.cxxx.store.coupon.dao")
@SpringBootApplication
public class StoreCouponApplication {




    public static void main(String[] args) {
        SpringApplication.run(StoreCouponApplication.class, args);
    }

}
