package com.java.spring.ws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("amountservice.wsdl");
		return marshaller;
	}
	
	@Bean
	public AmountServiceClient amountServiceClient(Jaxb2Marshaller jaxb2Marshaller) {
		AmountServiceClient amountServiceClient = new AmountServiceClient();
		amountServiceClient.setDefaultUri("http://localhost:8080/cxfsoapws/services/amountservice");
		amountServiceClient.setMarshaller(jaxb2Marshaller);
		amountServiceClient.setUnmarshaller(jaxb2Marshaller);
		return amountServiceClient;
	}

}
