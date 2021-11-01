package com.example.MSA_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Eureka 서버로서 동작하기 위해 @EnableEurekaServer 활성화
@SpringBootApplication
@EnableEurekaServer
public class MsaPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaPracApplication.class, args);
	}

}
