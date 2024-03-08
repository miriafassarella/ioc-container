package com.ioc.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ioc.container.model.Client;
import com.ioc.container.service.ActivationClientService;

@RestController
public class Controller {
	
	@Autowired
	ActivationClientService activation;
	
	Client client = new Client("Joao", "joao@gmail.com", "873-554-2345");

	@GetMapping("/hello")
	public String hello() {
		activation.ativar(client);
		return "Hello!";
	}
}
