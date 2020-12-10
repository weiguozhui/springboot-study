package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 启动方法：1.直接运行main方法就可以启动springboot项目
 * 2.java -jar 命令启动
 * 3.mvn命令启动 mvn spring-boot:run
 */
// 定义该类为启动类
@SpringBootApplication
// 定义扫描mapper的注解，是mybaties的注解
@MapperScan(basePackages = "com.example.demo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
