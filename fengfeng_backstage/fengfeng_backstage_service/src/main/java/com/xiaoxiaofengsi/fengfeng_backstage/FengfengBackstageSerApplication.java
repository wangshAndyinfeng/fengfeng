package com.xiaoxiaofengsi.fengfeng_backstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


//@ImportResource({"classpath*:/spring/spring-aop-transaction.xml"})
@MapperScan("com.xiaoxiaofengsi.*.dao")
@ComponentScan("com.xiaoxiaofengsi")
@SpringBootApplication
public class FengfengBackstageSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FengfengBackstageSerApplication.class, args);
	}
}
