package com.ioc.container.notifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.ioc.container.model.Client;

@Qualifier("sms")
@Component
public class NotifierSMS implements Notifier{

	@Override
	public void notifier(Client client, String message) {
		System.out.printf("Notificando %s pelo telefone %s : %s\n", client.getName(), client.getPhone(), message);
		
	}

}
