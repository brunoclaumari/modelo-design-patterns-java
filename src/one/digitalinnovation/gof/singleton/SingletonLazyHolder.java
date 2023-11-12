package one.digitalinnovation.gof.singleton;

/**
 * Singleton LazyHolder "Thread safe"
 * 
 * @see <a href="https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148">Referência</a>
 * 
 * @author Bruno de Sousa
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder _instancia = new SingletonLazyHolder();		
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return InstanceHolder._instancia;
	}

}
