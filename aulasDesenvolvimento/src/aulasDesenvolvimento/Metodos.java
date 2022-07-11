package aulasDesenvolvimento;

public class Metodos {
	
	String nome = "Valentina";
	int idade = 18;

	/*
	 * 
	 * AULA 1 (Entendendo a estrutura de um método):
	 * 
	 * Métodos
	 * 
	 * Métodos são comportamentos/ações que determinados objetos terão em suas classes.
	 */
	
	public void exemplosMetodos() {}
	
	/*
	 * 
	 * Métodos possuem um modificador de acesso (Ex. public), um tipo de retorno (Ex. void) e parâmetros que é o que fica dentro do ()
	 * Além disso temos ainda a assinatura do método, que é composta por seu nome e parâmetros.
	 *  
	 */
	
	/*
	 * 
	 * Modificador de acesso (public): define o tipo de visibilidade do método, entenderemos melhor isso quando falarmos de encapsulamento.
	 * Tipo de Retorno (void): O método pode ser acionado para realizar uma determinada ação apenas ou para nos trazer uma informação, nesse caso é necessário informar no lugar do void o seu tipo de retorno
	 * Nome (exemplosMetodos): Esse é o seu identificador para que possamos chamá-los.
	 * Parâmetro (()): São valores externos ao método que são necessários para a execução do método.
	 * Assinatura (exemplosMetodos()): É também o identificador do método e em caso de métodos com o mesmo nome ajuda a escolher o método corretamente.
	 * 
	 */
	
	/*
	 * AULA 2 (Trabalhando com retornos e parâmetros):
	 * 
	 * Em todos os métodos devemos informar um tipo de retorno e podemos ou não ter parâmetros.
	 * 
	 * Caso o método tenha o objetivo de realizar alguma ação sem ter que retornar algo devemos informar que esse método não possui um retorno através da palavra "void" e caso ele tenha o objetivo de retornar algo
	 * devemos então informar qual o tipo de retorno ele terá (Ex. String, boolean, int, etc.).
	 *  
	 */
	
	public void testarParametros() {}
	
	public String testarParametros(int valor) { return "valor";}
	
	public void exibirNome() {
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
	}
	
	/*
	 * AULA 3 (Assinatura e Sobrecarga de métodos)
	 * 
	 * Sobrecarga de métodos:
	 * Pode acontecer de termos métodos com o mesmo nome, o que chamamos de sobrecarga de métodos, o que de fato vai diferenciá-los é a sua assinatura, que nunca poderá ser a mesma.
	 * Vamos ver alguns exemplos agora.
	 */
	
	public void exibirNome(int idade) {
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
	}
	
	public void exibirNome(String nome) {
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
	}
	
	/*
	 * AULA 4 (Reescrita de métodos):
	 * 
	 * A reescrita de métodos é a releitura de um método existente aplicando a esse método uma implementação diferente.
	 * Na reescrita de método é possível reaproveitar o que já foi feito no método original e aplicar as mudanças necessárias para que esse método reescrito atenda seus objetivos
	 * 
	 * A anotação @Override indica que esse método é reescrito.
	 * 
	 * Criar as classes Pessoa e Cliente e adicionar os métodos criarPessoa() e mostrarPessoa() para exemplificar essa reescrita.
	 * 
	 */
	
	/*
	 * AULA 5 (Criar mais exemplos de métodos)
	 */
	
	

}
