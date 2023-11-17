package com.cheng.chengojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.cheng.chengojbackenduserservice.mapper")
@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients(basePackages ={"com.cheng.chengojbackendserviceclient.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.cheng")
public class ChengojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengojBackendUserServiceApplication.class, args);
    }

}
