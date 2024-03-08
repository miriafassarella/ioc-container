package com.ioc.container.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;

import com.ioc.container.notifier.Notifier;



@Component
public class ActivationClientService {
	
	private Notifier notifier;

	public void ativar(Client client) {
		client.activate();
		notifier.notifier(client, "Sua conta está ativa!");
	}
	
	/*Injecting dependency into the set method*/
	@Autowired
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	}
