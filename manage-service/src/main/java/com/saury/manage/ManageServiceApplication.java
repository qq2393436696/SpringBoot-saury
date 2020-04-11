package com.saury.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.saury.manage.mapper")
@EnableTransactionManagement
public class ManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageServiceApplication.class, args);
	}

}
