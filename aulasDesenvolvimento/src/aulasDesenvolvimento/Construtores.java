package aulasDesenvolvimento;

public class Construtores {

	String nome;
	int idade;
	String descricao = "";

	/*
	 * AULA 1 - (Entendendo a estrutura de um construtor):
	 * 
	 * O que s�o: Construtores s�o as a��es que s�o geradas sempre que instanciamos
	 * um determinado objeto, ou seja, eles sempre ser�o acionados quando um objeto
	 * � instanciado, mesmo que n�o declarados na classe de origem. Todas as classes
	 * possuem implicitamente um construtor que pode ou n�o ser declarado na classe
	 * de origem.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Como � composta a estrutura de um construtor?
	 * 
	 * O construtor assim como o m�todo possui um modificador de acesso, nome,
	 * par�metros e assinatura, mas diferentemente dos m�todos ele n�o possui um
	 * tipo de retorno, ou seja, os construtores n�o tem retorno.
	 * 
	 * Visualizar no c�digo a estrutura de um construtor e falar um pouco das
	 * difern�as com os m�todos em rela��o a sua utiliza��o.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Como usar um construtor?
	 * Sempre que um objeto � instanciado o construtor desse objeto � chamado, ou seja, 
	 * ele sempre entra em execu��o quando h� um objeto instanciado.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Porque usar um construtor?
	 * Como falado anteriormente para usar um construtor, basta instanciar um objeto da classe que o construtor entra em a��o.
	 * Querendo ou n�o voc� sempre vai utiliz�-los.
	 * 
	 * Mas o grande benef�cio de utiliz�-lo � o fator de realizar alguma determinada a��o sempre que esse objeto entrar em execu��o.
	 * Por exemplo, ao criar uma conta eu posso definir que essa conta receber� de saldo R$ 0,00. o construtor � uma �tima op��o para isso.
	 * 
	 * Outro benef�cio � o fato de definirmos a obrigatoriedade de informar algum par�metro para instanciar esse objeto. Vamos ver a seguir.
	 * 
	 */
	public Construtores() {

	}

	/*
	 *
	 * AULA 2 (Trabalhando com par�metros):
	 * 
	 * Par�metro (()): S�o valores externos ao construtor e que precisar�o ser utilizados no construtor que podem ser uma "c�pia" de um ou mais atributos da classe
	 * de origem que s�o necess�rios para a execu��o do construtor. 
	 * 
	 */

	public Construtores(int valor) {
		
		//Exibir o valor digitado para melhor compreens�o de sua utiliza��o
		System.out.println("Valor recebido: " + valor);
	}

	/*
	 * AULA 3 (Assinatura e Sobrecarga de construtores)
	 * 
	 * Sobrecarga de construtores: Pode acontecer de termos construtores com o mesmo nome, o que chamamos de sobrecarga de construtores, o que de fato vai
	 * diferenci�-los � a sua assinatura, que nunca poder� ser a mesma. Vamos ver alguns exemplos agora.
	 */

	public Construtores(String nome) {
		this.nome = nome;
		System.out.println("Nome: " + nome);
	}

	public Construtores(String nome, String descricao) {
		//this(nome);
		this.nome = nome;
		this.descricao = descricao;

		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
	}
	
	/*
	 * AULA 4 (Reaproveitamento de construtores)
	 * 
	 * Em caso da necessidade de reutiliza��o de construtores para evitar de ter que reescrever todo o c�digo de outros construtores � poss�vel chamar outros construtores dentro do atual,
	 * desde que essa chamada seja feita j� na primeira linha.
	 * 
	 */
	
	public Construtores(String nome, String descricao, int idade) {
		this(nome, descricao);
		this.idade = idade;
	}
	
	
	/*
	 * AULA 5 (Criar mais exemplos de construtores)
	 */

}
