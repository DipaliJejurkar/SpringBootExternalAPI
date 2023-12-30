package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExternalApiExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApiExApplication.class, args);
	}

}
