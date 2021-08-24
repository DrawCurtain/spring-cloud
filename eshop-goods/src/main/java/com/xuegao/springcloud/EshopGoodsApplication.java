package com.xuegao.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/20 11:38
 */

@SpringBootApplication
@MapperScan("com.xuegao.springcloud.mapper")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.xuegao.springcloud.client")
public class EshopGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopGoodsApplication.class, args);
    }
}

