package com.exercise.mbts12;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.exercise.mbts12.mapper")
@SpringBootApplication
public class Mbts12Application {

	public static void main(String[] args) {
		SpringApplication.run(Mbts12Application.class, args);
	}
}
