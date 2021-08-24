package com.xuegao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/20 9:31
 */

@SpringBootApplication
@MapperScan("com.xuegao.mapper")
@EnableDiscoveryClient
public class EshopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopUserApplication.class, args);
    }
}

