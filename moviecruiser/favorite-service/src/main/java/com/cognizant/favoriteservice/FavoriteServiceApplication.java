package com.cognizant.favoriteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FavoriteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavoriteServiceApplication.class, args);
	}

}
