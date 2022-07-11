package aulasDesenvolvimento;

public class ConversaoAtributo {

	/*
	 * CASTING AULA 1
	 * 
	 * Casting de atributos é a conversão de tipos de atributos. Mas há a
	 * necessidade de converter atributos para outros tipos? Não seria mais fácil
	 * então já declarar o atributo com o tipo que precisamos receber?
	 * 
	 * O que acontece é que muitas vezes precisamos pegar valores de outros módulos
	 * ou até mesmo de nosso sistema que são de tipos diferentes, por exemplo,
	 * quando pegamos informações do front-end (por exemplo de uma página web),
	 * nessa página todos os valores manipulados são String mesmo que o usuário
	 * digite um valor numérico esse valor entra em nosso sistema como String e
	 * nesse caso precisamos converter esse valor para double. Em uma situação como
	 * essa não teríamos como utilizar esses dados em nosso sistema. Para isso
	 * existe o CASTING
	 * 
	 * Vamos ver a conversão entre byte, short, int e long
	 * 
	 */

	// Simular essas conversões na main e mostrar que a conversão do menor para o
	// maior é automática e que a do maior para o menor é necessário o cast
	byte testeByte = 1;
	short testeShort = testeByte; // Quando faço uma conversão de um tipo compatível menor para um tipo maior a conversão é automática

	/*
	 * Agora quando precisamos converter de um tipo maior para um menor, precisamos
	 * ter em mente que podemos perder precisão e obtermos um resultado não esperado
	 * Por isso essa conversão precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer então
	 */

	short testeShort2 = 7;
	byte testeByte2 = (byte) testeShort2; // byte testeByte2 = testeShort2; - isso não compila.

	// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

	/*
	 * CASTING AULA 2
	 * 
	 * Simular essas conversões na main e mostrar que a conversão do menor para o
	 * maior é automática e que a do maior para o menor é necessário o cast Agora
	 * quando precisamos converter de um tipo maior para um menor, precisamos ter em
	 * mente que podemos perder precisão e obtermos um resultado não esperado Por
	 * isso essa conversão precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer então
	 */
	int testeInt = 4;
	long testeLong = 5;

	/*
	 * CASTING AULA 3
	 * 
	 * Simular essas conversões na main e mostrar que a conversão do menor para o
	 * maior é automática e que a do maior para o menor é necessário o cast Agora
	 * quando precisamos converter de um tipo maior para um menor, precisamos ter em
	 * mente que podemos perder precisão e obtermos um resultado não esperado Por
	 * isso essa conversão precisa ser bem pensada antes
	 * 
	 * Vamos ver como fazer então
	 */

	float testeFloat = 6f;
	double testeDouble = 7.25;

	// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	
	/*
	 * CASTING AULA 4
	 * 
	 * Usar exemplos de conversão
	 * double p/ int, short, byte etc.
	 * 
	 */
	
	double valor = 25.3;
	int valorAbsoluto = (int) valor;
	double valorConvertidoDouble = valorAbsoluto;

	String testeValorString = "25.3";
	double convertStringPInt = Double.valueOf(testeValorString);

	/*
	 * Conversões que o Java realiza automáticamente.
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
	 * Conversões que o programador precisa forçar.
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
		System.out.println("Conversao Forçada: " + testeLong);
	}

}
