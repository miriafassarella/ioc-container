package com.ioc.container.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;

import com.ioc.container.notifier.Notifier;



@Component
public class ActivationClientService {
	
	@Autowired
	private List<Notifier> notifiers;

	public void ativar(Client client) {
		client.activate();
		
		for(Notifier notifier : notifiers) {
			notifier.notifier(client, "Sua conta está ativa!");
		}
		
	}

}
