package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author Bruno de Sousa
 */
public class SingletonLazy {
	
	private static SingletonLazy _instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if(_instancia == null)
			_instancia = new SingletonLazy();
		
		return _instancia;
	}

}
