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
