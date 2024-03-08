# ioc-container
Exercising with the Spring IoC Container

---

### Trois façons d'injecter une dépendance dans une classe : 
- [x] Injecter directement dans le constructeur de la classe
```ruby
@Component
public class ActivationClientService {

	private Notifier notifier;

	public ActivationClientService(Notifier notifier) {
		this.notifier = notifier;
	}
}
```
- [x] Injecter dans la méthode set()
```ruby
@Component
public class ActivationClientService {
	
	private Notifier notifier;
	
	@Autowired
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
}
```
- [x] En utilisant l'annotation @Autowired directement dans l'attribut
```ruby
@Component
public class ActivationClientService {
	
	@Autowired
	private Notifier notifier;
	}
```
---

### Personnalisation des beans : 
- Quand on veut personalisé un bean, on fait sa configuration dans une classe de configuration.
-  À ce moment là, la classe ActivationClientService et NotifierEmail n'ont plus l'annotation @Component.
```ruby
@Configuration
public class Config {
	
	@Bean
	public ActivationClientService activationClientService() {
		return new ActivationClientService();
	}
	
	@Bean
	public NotifierEmail notifierEmail() {
		return new NotifierEmail();
	}

}
```

