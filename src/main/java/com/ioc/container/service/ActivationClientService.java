package com.ioc.container.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;
import com.ioc.container.notifier.LevelUrgent;
import com.ioc.container.notifier.Notifier;
import com.ioc.container.notifier.TypeNotifier;



@Component
public class ActivationClientService {
	
	/*Handling beans ambiguity by creating an annotation*/
	@TypeNotifier(LevelUrgent.USUALLY)
	@Autowired
	private Notifier notifier;

	public void ativar(Client client) {
		client.activate();
		notifier.notifier(client, "Sua conta está ativa!");
	}
}
