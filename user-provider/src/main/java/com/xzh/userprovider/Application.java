package com.xzh.userprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 向振华
 * @date 2019/05/08 11:00
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.xzh.userprovider.mapper")
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}