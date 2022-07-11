package aulasDesenvolvimento;

public class EscopoAtributos {

	//Atributo de classe
	static String tipoCliente = "PF";
	
	//Constantes s�o definidos o seu valor na declara��o da vari�vel n�o podem ser alteradas em nenhum outro momento
	final static String TESTE = "teste de constante";
	
	//Atributo de inst�ncia
	String nome;
	String email;
	
	public void testeEscopo(int idade) {
		
		//TESTE = "teste";
		
		if (idade >= 18) {
			System.out.println("Pode tirar sua habilita��o!");
		}else {
			int tempoEspera = 18 - idade;
			System.out.println(nome);
			System.out.println("Precisa aguardar mais " + tempoEspera + " anos");
		}
		
		
	}
	
}
