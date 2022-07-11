package aulasDesenvolvimento;

public class Construtores {

	String nome;
	int idade;
	String descricao = "";

	/*
	 * AULA 1 - (Entendendo a estrutura de um construtor):
	 * 
	 * O que são: Construtores são as ações que são geradas sempre que instanciamos
	 * um determinado objeto, ou seja, eles sempre serão acionados quando um objeto
	 * é instanciado, mesmo que não declarados na classe de origem. Todas as classes
	 * possuem implicitamente um construtor que pode ou não ser declarado na classe
	 * de origem.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Como é composta a estrutura de um construtor?
	 * 
	 * O construtor assim como o método possui um modificador de acesso, nome,
	 * parâmetros e assinatura, mas diferentemente dos métodos ele não possui um
	 * tipo de retorno, ou seja, os construtores não tem retorno.
	 * 
	 * Visualizar no código a estrutura de um construtor e falar um pouco das
	 * difernças com os métodos em relação a sua utilização.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Como usar um construtor?
	 * Sempre que um objeto é instanciado o construtor desse objeto é chamado, ou seja, 
	 * ele sempre entra em execução quando há um objeto instanciado.
	 * 
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 * Porque usar um construtor?
	 * Como falado anteriormente para usar um construtor, basta instanciar um objeto da classe que o construtor entra em ação.
	 * Querendo ou não você sempre vai utilizá-los.
	 * 
	 * Mas o grande benefício de utilizá-lo é o fator de realizar alguma determinada ação sempre que esse objeto entrar em execução.
	 * Por exemplo, ao criar uma conta eu posso definir que essa conta receberá de saldo R$ 0,00. o construtor é uma ótima opção para isso.
	 * 
	 * Outro benefício é o fato de definirmos a obrigatoriedade de informar algum parâmetro para instanciar esse objeto. Vamos ver a seguir.
	 * 
	 */
	public Construtores() {

	}

	/*
	 *
	 * AULA 2 (Trabalhando com parâmetros):
	 * 
	 * Parâmetro (()): São valores externos ao construtor e que precisarão ser utilizados no construtor que podem ser uma "cópia" de um ou mais atributos da classe
	 * de origem que são necessários para a execução do construtor. 
	 * 
	 */

	public Construtores(int valor) {
		
		//Exibir o valor digitado para melhor compreensão de sua utilização
		System.out.println("Valor recebido: " + valor);
	}

	/*
	 * AULA 3 (Assinatura e Sobrecarga de construtores)
	 * 
	 * Sobrecarga de construtores: Pode acontecer de termos construtores com o mesmo nome, o que chamamos de sobrecarga de construtores, o que de fato vai
	 * diferenciá-los é a sua assinatura, que nunca poderá ser a mesma. Vamos ver alguns exemplos agora.
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
	 * Em caso da necessidade de reutilização de construtores para evitar de ter que reescrever todo o código de outros construtores é possível chamar outros construtores dentro do atual,
	 * desde que essa chamada seja feita já na primeira linha.
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
