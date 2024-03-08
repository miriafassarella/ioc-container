package com.ioc.container.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;

import com.ioc.container.notifier.Notifier;



@Component
public class ActivationClientService {
	
	private Notifier notifier;
	
	/*Injecting the dependency into the class constructor*/
	public ActivationClientService(Notifier notifier) {
		this.notifier = notifier;
	}

	public void ativar(Client client) {
		client.activate();
		notifier.notifier(client, "Sua conta está ativa!");
	}

}
