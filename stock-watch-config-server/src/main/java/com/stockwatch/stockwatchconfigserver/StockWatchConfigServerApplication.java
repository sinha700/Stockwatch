package com.stockwatch.stockwatchconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StockWatchConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockWatchConfigServerApplication.class, args);
	}

}
