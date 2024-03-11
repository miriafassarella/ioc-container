package com.ioc.container.notifier;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.ioc.container.model.Client;

@Profile("dev")
@TypeNotifier(LevelUrgent.USUALLY)
@Component
public class NotifierEmailMock implements Notifier{

		@Override
		public void notifier(Client client, String message) {
			System.out.printf("Notificando %s pelo e-mail mock %s : %s\n", client.getName(), client.getMail(), message);
			
		}
}
