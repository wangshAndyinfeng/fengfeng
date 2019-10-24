package com.xiaoxiaofengsi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xiaoxiaofengsi.mapper")
public class GpShardApp {
	public static void main(String[] args) {
		SpringApplication.run(GpShardApp.class, args);
	}

}
