package com.example.MSA_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaPracApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
//		@LoadBalanced가 활성화되면 Eureka에 내장된 로드밸런서인 Ribbon을 이용해 라운드로빈 기반의 서비스 인스턴스를 호출
		return new RestTemplate();
	}
}
