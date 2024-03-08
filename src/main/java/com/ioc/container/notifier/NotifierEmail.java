package com.ioc.container.notifier;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;


@Qualifier("mail")
@Component
public class NotifierEmail implements Notifier{

	@Override
	public void notifier(Client client, String message) {
		System.out.printf("Notificando %s pelo e-mail %s : %s\n", client.getName(), client.getMail(), message);
		
	}

}
