package com.ioc.container.notifier;

import com.ioc.container.model.Client;

public interface Notifier {
	
	public void notifier(Client client, String message);

}
