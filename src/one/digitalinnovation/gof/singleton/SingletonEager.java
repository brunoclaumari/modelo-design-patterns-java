package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author Bruno de Sousa
 */
public class SingletonEager {
	
	private static SingletonEager _instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return _instancia;
	}

}
