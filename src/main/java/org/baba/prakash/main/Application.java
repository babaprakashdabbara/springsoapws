package org.baba.prakash.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.java.spring.ws.client.AmountServiceClient;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(AmountServiceClient amountServiceClient) {
		return args -> {
			String ticker = "MSFT";

			if (args.length > 0) {
				ticker = args[0];
			}
			Integer amountAdded = amountServiceClient.getAmountAdded();
			System.out.println(amountAdded);
		};
	}
	

}
