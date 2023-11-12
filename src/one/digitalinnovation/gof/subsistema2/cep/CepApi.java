package one.digitalinnovation.gof.subsistema2.cep;

public class CepApi {
private static CepApi _instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {		
		return _instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}

}
