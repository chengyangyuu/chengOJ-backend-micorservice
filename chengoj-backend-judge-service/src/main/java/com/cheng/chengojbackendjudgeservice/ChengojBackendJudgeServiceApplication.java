package com.cheng.chengojbackendjudgeservice;

import com.cheng.chengojbackendjudgeservice.mq.CodeMqInitMain;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients(basePackages ={"com.cheng.chengojbackendserviceclient.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.cheng")
public class ChengojBackendJudgeServiceApplication {

	public static void main(String[] args) {
		CodeMqInitMain.doInitCodeMq();
		SpringApplication.run(ChengojBackendJudgeServiceApplication.class, args);
	}

}

