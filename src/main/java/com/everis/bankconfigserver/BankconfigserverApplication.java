package com.everis.bankconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BankconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankconfigserverApplication.class, args);
	}

}
