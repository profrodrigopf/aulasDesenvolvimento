package aulasDesenvolvimento;

public class EscopoAtributos {

	//Atributo de classe
	static String tipoCliente = "PF";
	
	//Constantes são definidos o seu valor na declaração da variável não podem ser alteradas em nenhum outro momento
	final static String TESTE = "teste de constante";
	
	//Atributo de instância
	String nome;
	String email;
	
	public void testeEscopo(int idade) {
		
		//TESTE = "teste";
		
		if (idade >= 18) {
			System.out.println("Pode tirar sua habilitação!");
		}else {
			int tempoEspera = 18 - idade;
			System.out.println(nome);
			System.out.println("Precisa aguardar mais " + tempoEspera + " anos");
		}
		
		
	}
	
}
