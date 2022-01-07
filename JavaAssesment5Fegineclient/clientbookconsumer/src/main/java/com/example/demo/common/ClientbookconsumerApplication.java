package com.example.demo.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class ClientbookconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientbookconsumerApplication.class, args);
	}
	
	@Bean
	public BookRestConsumer bookRest() {
		return new BookRestConsumer();
	}

}
