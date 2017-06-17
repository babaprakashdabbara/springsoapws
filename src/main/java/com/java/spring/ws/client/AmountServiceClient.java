package com.java.spring.ws.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AmountServiceClient extends WebServiceGatewaySupport {
	
	public Integer getAmountAdded() {
		Integer amountAdded = (Integer)getWebServiceTemplate().marshalSendAndReceive(20);
		return amountAdded;
	}
}
