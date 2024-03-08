package com.ioc.container;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ioc.container.notifier.NotifierEmail;
import com.ioc.container.service.ActivationClientService;

@Configuration
public class Config {
	
	@Bean
	public ActivationClientService activationClientService() {
		return new ActivationClientService();
	}
	
	@Bean
	public NotifierEmail notifierEmail() {
		return new NotifierEmail();
	}

}
