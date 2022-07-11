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
	 * Todo atributo tem um escopo, ou seja um contexo em que ele será aplicado
	 * A seguir vamos conhecer esses escopo
	 * 
	 * De instância, de classe, Constantes e local
	 */
	
	/*
	 * De instância, são atributos que definem a características de um objeto, ou seja cada objeto tem suas próprias características.
	 * 
	 * De classe, são atributos específicos da própria classe que independente do atributo instanciado no momento o valor desse atributo 
	 * será sempre o mesmo. Caso esse valor seja alterado na classe esse valor vai ser aplicado para todos os objetos.
	 * 
	 * Locais são atributos que são declarados em determinados trechos de código, ex. um método, uma estrutura de decisão ou até mesmo uma estrutura de repetição.
	 * 
	 */
	
	/*
	 * 
	 * TIPOS AULA 1
	 * 
	 * Explicar a diferença de atributos primitivos e de objetos
	 * 
	 * O tipo de atributo define qual o tipo de dado será armazenado no atributo, por exemplo a idade de uma pessoa, o nome, renda, data de nascimento, etc.
	 * 
	 * Existem 8 tipos primitivos que vamos ver a seguir
	 * 
	 * Vamos começar com booleano, char e byte
	 */
	

	// boolean é um valor boleano que aceita valores true ou false tamanho 1 bit.
	boolean boleana = true;
	boolean boleana2 = false;

	// Char - é um tipo que aceita valores alfanuméricos, porém com apenas um
	// caracter tamanho 1 byte.
	char testeChar = 'a';

	/*
	 * Quando utilizamos valores literais numéricos, é importante ressaltar que esses valores literais são int, mesmo que tenhamos um atributo definido como long, esse valor, terá a mesma capacidade
	 * que o int, por isso para inserirmos um valor long e para indicarmos que queremos de fato utilizar um long precisamos inserir o "L" de long ao final do número.
	 * 
	 * byte aceita valores numéricos absolutos, ou seja, sem casas decimais tamanho 1 byte (Aceita até 3 dígitos no intervalo de -128 até 127) 
	 */
	// 
	byte testeByte = -128;
	byte testeByte2 = 127;

	/*
	 * TIPOS AULA 2
	 * 
	 * short aceita valores numéricos absolutos, ou seja, sem casas decimais tamanho
	 * 2 bytes (Aceita até 5 dígitos)
	 */
	
	short testeShort = 12345;

	// int aceita valores numéricos absolutos, ou seja, sem casas decimais tamanho 4
	// bytes
	int numero = 1234567890;

	//Os valores numéricos absolutos, ou seja, sem casas decimais, por padrão no Java são do tipo int, mesmo que se defina o atributo como long ele será implicitamente int, para indicar que o valor
	//que informamos é um long precisamos forçar esse valor como long inserindo o "L" de long ao final do valor informado.
	// long aceita valores numéricos absolutos, ou seja, sem casas decimais tamanho
	// 8 bytes
	long testeLong = 12345678901l;
	
	/*
	 * TIPOS AULA 3
	 * 
	 * Quando utilizamos valores literais reais (ponto-flutuante), é importante ressaltar que esses valores literais são double.
	 *
	 * float aceita valores numéricos do tipo real, ou seja, aceita valores com casas decimais tamanho 4 bytes
	 * 
	 */
	float testeFloat = 123456789012345678901234567890123456789.12f;

	// double aceita valores numéricos do tipo real, ou seja, aceita valores com casas decimais tamanho 8 bytes
	double testeDouble = 12345678901234567890123456789012345678955555555555.12;
	
	/* Apesar de float e double utilizarem valores reais eles não tem muita precisão, então quando for utilizar valores monetários em que seja fundamental a precisão desses valores é recomendada a utilização
	 * de um outro tipo que apesar de não ser primitivo da linguagem é o mais recomendado para esses casos. O BigDecimal.
	 */
}
