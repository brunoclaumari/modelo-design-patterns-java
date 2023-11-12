package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.IComportamento;
import one.digitalinnovation.gof.strategy.Robo;

public class TestClass {

	public static void main(String[] args) {
		// Testes relacionados ao Design Pattern Singleton
//		SingletonLazy lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		
//		lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		
//		SingletonEager eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		
//		eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		
//		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
//		
//		lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
		
		//Testes relacionados ao design pattern Strategy
		
//		IComportamento normal = new ComportamentoNormal();
//		IComportamento defensivo = new ComportamentoDefensivo();
//		IComportamento agressivo= new ComportamentoAgressivo();
//		
//		Robo robo = new Robo();
//		robo.setComportamento(normal);
//		
//		robo.mover();
//		robo.mover();
//		
//		robo.setComportamento(defensivo);		
//		robo.mover();
//		
//		robo.setComportamento(agressivo);		
//		robo.mover();
//		robo.mover();
//		robo.mover();
		
		//Testes relacionados ao design pattern Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Bruno de Sousa", "09974345");
		

	}

}
