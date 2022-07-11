package aulasDesenvolvimento;

public class Atributos {
	
	static long valor = 1;
	
	public void testeValor() {
		valor = 2;
		System.out.println("Valor: " + valor);
	}

	// Atributos
	
	/*
	 * ESCOPO:
	 * Escopo de atributo
	 * Todo atributo tem um escopo, ou seja um contexo em que ele ser� aplicado
	 * A seguir vamos conhecer esses escopo
	 * 
	 * De inst�ncia, de classe, Constantes e local
	 */
	
	/*
	 * De inst�ncia, s�o atributos que definem a caracter�sticas de um objeto, ou seja cada objeto tem suas pr�prias caracter�sticas.
	 * 
	 * De classe, s�o atributos espec�ficos da pr�pria classe que independente do atributo instanciado no momento o valor desse atributo 
	 * ser� sempre o mesmo. Caso esse valor seja alterado na classe esse valor vai ser aplicado para todos os objetos.
	 * 
	 * Locais s�o atributos que s�o declarados em determinados trechos de c�digo, ex. um m�todo, uma estrutura de decis�o ou at� mesmo uma estrutura de repeti��o.
	 * 
	 */
	
	/*
	 * 
	 * TIPOS AULA 1
	 * 
	 * Explicar a diferen�a de atributos primitivos e de objetos
	 * 
	 * O tipo de atributo define qual o tipo de dado ser� armazenado no atributo, por exemplo a idade de uma pessoa, o nome, renda, data de nascimento, etc.
	 * 
	 * Existem 8 tipos primitivos que vamos ver a seguir
	 * 
	 * Vamos come�ar com booleano, char e byte
	 */
	

	// boolean � um valor boleano que aceita valores true ou false tamanho 1 bit.
	boolean boleana = true;
	boolean boleana2 = false;

	// Char - � um tipo que aceita valores alfanum�ricos, por�m com apenas um
	// caracter tamanho 1 byte.
	char testeChar = 'a';

	/*
	 * Quando utilizamos valores literais num�ricos, � importante ressaltar que esses valores literais s�o int, mesmo que tenhamos um atributo definido como long, esse valor, ter� a mesma capacidade
	 * que o int, por isso para inserirmos um valor long e para indicarmos que queremos de fato utilizar um long precisamos inserir o "L" de long ao final do n�mero.
	 * 
	 * byte aceita valores num�ricos absolutos, ou seja, sem casas decimais tamanho 1 byte (Aceita at� 3 d�gitos no intervalo de -128 at� 127) 
	 */
	// 
	byte testeByte = -128;
	byte testeByte2 = 127;

	/*
	 * TIPOS AULA 2
	 * 
	 * short aceita valores num�ricos absolutos, ou seja, sem casas decimais tamanho
	 * 2 bytes (Aceita at� 5 d�gitos)
	 */
	
	short testeShort = 12345;

	// int aceita valores num�ricos absolutos, ou seja, sem casas decimais tamanho 4
	// bytes
	int numero = 1234567890;

	//Os valores num�ricos absolutos, ou seja, sem casas decimais, por padr�o no Java s�o do tipo int, mesmo que se defina o atributo como long ele ser� implicitamente int, para indicar que o valor
	//que informamos � um long precisamos for�ar esse valor como long inserindo o "L" de long ao final do valor informado.
	// long aceita valores num�ricos absolutos, ou seja, sem casas decimais tamanho
	// 8 bytes
	long testeLong = 12345678901l;
	
	/*
	 * TIPOS AULA 3
	 * 
	 * Quando utilizamos valores literais reais (ponto-flutuante), � importante ressaltar que esses valores literais s�o double.
	 *
	 * float aceita valores num�ricos do tipo real, ou seja, aceita valores com casas decimais tamanho 4 bytes
	 * 
	 */
	float testeFloat = 123456789012345678901234567890123456789.12f;

	// double aceita valores num�ricos do tipo real, ou seja, aceita valores com casas decimais tamanho 8 bytes
	double testeDouble = 12345678901234567890123456789012345678955555555555.12;
	
	/* Apesar de float e double utilizarem valores reais eles n�o tem muita precis�o, ent�o quando for utilizar valores monet�rios em que seja fundamental a precis�o desses valores � recomendada a utiliza��o
	 * de um outro tipo que apesar de n�o ser primitivo da linguagem � o mais recomendado para esses casos. O BigDecimal.
	 */
}
