package aulasDesenvolvimento;

public class ConversaoAtributo {

	/*
	 * CASTING AULA 1
	 * 
	 * Casting de atributos � a convers�o de tipos de atributos. Mas h� a
	 * necessidade de converter atributos para outros tipos? N�o seria mais f�cil
	 * ent�o j� declarar o atributo com o tipo que precisamos receber?
	 * 
	 * O que acontece � que muitas vezes precisamos pegar valores de outros m�dulos
	 * ou at� mesmo de nosso sistema que s�o de tipos diferentes, por exemplo,
	 * quando pegamos informa��es do front-end (por exemplo de uma p�gina web),
	 * nessa p�gina todos os valores manipulados s�o String mesmo que o usu�rio
	 * digite um valor num�rico esse valor entra em nosso sistema como String e
	 * nesse caso precisamos converter esse valor para double. Em uma situa��o como
	 * essa n�o ter�amos como utilizar esses dados em nosso sistema. Para isso
	 * existe o CASTING
	 * 
	 * Vamos ver a convers�o entre byte, short, int e long
	 * 
	 */

	// Simular essas convers�es na main e mostrar que a convers�o do menor para o
	// maior � autom�tica e que a do maior para o menor � necess�rio o cast
	byte testeByte = 1;
	short testeShort = testeByte; // Quando fa�o uma convers�o de um tipo compat�vel menor para um tipo maior a convers�o � autom�tica

	/*
	 * Agora quando precisamos converter de um tipo maior para um menor, precisamos
	 * ter em mente que podemos perder precis�o e obtermos um resultado n�o esperado
	 * Por isso essa convers�o precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer ent�o
	 */

	short testeShort2 = 7;
	byte testeByte2 = (byte) testeShort2; // byte testeByte2 = testeShort2; - isso n�o compila.

	// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

	/*
	 * CASTING AULA 2
	 * 
	 * Simular essas convers�es na main e mostrar que a convers�o do menor para o
	 * maior � autom�tica e que a do maior para o menor � necess�rio o cast Agora
	 * quando precisamos converter de um tipo maior para um menor, precisamos ter em
	 * mente que podemos perder precis�o e obtermos um resultado n�o esperado Por
	 * isso essa convers�o precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer ent�o
	 */
	int testeInt = 4;
	long testeLong = 5;

	/*
	 * CASTING AULA 3
	 * 
	 * Simular essas convers�es na main e mostrar que a convers�o do menor para o
	 * maior � autom�tica e que a do maior para o menor � necess�rio o cast Agora
	 * quando precisamos converter de um tipo maior para um menor, precisamos ter em
	 * mente que podemos perder precis�o e obtermos um resultado n�o esperado Por
	 * isso essa convers�o precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer ent�o
	 */

	float testeFloat = 6f;
	double testeDouble = 7.25;

	// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	
	/*
	 * CASTING AULA 4
	 * 
	 * Usar exemplos de convers�o
	 * double p/ int, short, byte etc.
	 * 
	 */
	
	double valor = 25.3;
	int valorAbsoluto = (int) valor;
	double valorConvertidoDouble = valorAbsoluto;

	String testeValorString = "25.3";
	double convertStringPInt = Double.valueOf(testeValorString);

	/*
	 * Convers�es que o Java realiza autom�ticamente.
	 */
	public void testeConversaoAutomatica() {
		testeShort = testeByte;
		testeInt = testeShort;
		testeFloat = testeInt;
		testeDouble = testeFloat;
		
		
	}

	public void exibirConversaoAutomatica() {
		System.out.println("Conversao Automatica: " + testeDouble);
	}

	/*
	 * Convers�es que o programador precisa for�ar.
	 */
	public void testeConversaoForcada() {
		/*testeFloat = (float) testeDouble;
		testeLong = (long) testeFloat;
		testeInt = (int) testeLong;
		testeShort = (short) testeInt;
		testeByte = (byte) testeShort;
		testeDouble = (float) testeFloat;*/
		
		testeLong = (int) testeInt;
	}

	public void exibirConversaoForcada() {
		System.out.println("Conversao For�ada: " + testeLong);
	}

}
