package one.digitalinnovation.gof.subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravar(String nome, String cep,String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM.");
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Cep: %s\n", cep);
		System.out.printf("Cidade: %s\n", cidade);
		System.out.printf("Estado: %s\n", estado);
	}

}
