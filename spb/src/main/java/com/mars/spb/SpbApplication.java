package com.mars.spb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mars.spb.dao") //dao扫描
public class SpbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbApplication.class, args);
	}

}
