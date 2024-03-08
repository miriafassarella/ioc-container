package com.ioc.container.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.container.model.Client;
import com.ioc.container.notifier.LevelUrgent;
import com.ioc.container.notifier.Notifier;
import com.ioc.container.notifier.TypeNotifier;


public class ActivationClientService {
	@TypeNotifier(LevelUrgent.USUALLY)
	@Autowired
	private Notifier notifier;
	
	public void ativar(Client client) {
		client.activate();
		notifier.notifier(client, "Sua conta está ativa!");
	}
}
