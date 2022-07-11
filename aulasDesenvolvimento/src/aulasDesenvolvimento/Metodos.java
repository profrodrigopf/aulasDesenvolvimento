package aulasDesenvolvimento;

public class Metodos {
	
	String nome = "Valentina";
	int idade = 18;

	/*
	 * 
	 * AULA 1 (Entendendo a estrutura de um m�todo):
	 * 
	 * M�todos
	 * 
	 * M�todos s�o comportamentos/a��es que determinados objetos ter�o em suas classes.
	 */
	
	public void exemplosMetodos() {}
	
	/*
	 * 
	 * M�todos possuem um modificador de acesso (Ex. public), um tipo de retorno (Ex. void) e par�metros que � o que fica dentro do ()
	 * Al�m disso temos ainda a assinatura do m�todo, que � composta por seu nome e par�metros.
	 *  
	 */
	
	/*
	 * 
	 * Modificador de acesso (public): define o tipo de visibilidade do m�todo, entenderemos melhor isso quando falarmos de encapsulamento.
	 * Tipo de Retorno (void): O m�todo pode ser acionado para realizar uma determinada a��o apenas ou para nos trazer uma informa��o, nesse caso � necess�rio informar no lugar do void o seu tipo de retorno
	 * Nome (exemplosMetodos): Esse � o seu identificador para que possamos cham�-los.
	 * Par�metro (()): S�o valores externos ao m�todo que s�o necess�rios para a execu��o do m�todo.
	 * Assinatura (exemplosMetodos()): � tamb�m o identificador do m�todo e em caso de m�todos com o mesmo nome ajuda a escolher o m�todo corretamente.
	 * 
	 */
	
	/*
	 * AULA 2 (Trabalhando com retornos e par�metros):
	 * 
	 * Em todos os m�todos devemos informar um tipo de retorno e podemos ou n�o ter par�metros.
	 * 
	 * Caso o m�todo tenha o objetivo de realizar alguma a��o sem ter que retornar algo devemos informar que esse m�todo n�o possui um retorno atrav�s da palavra "void" e caso ele tenha o objetivo de retornar algo
	 * devemos ent�o informar qual o tipo de retorno ele ter� (Ex. String, boolean, int, etc.).
	 *  
	 */
	
	public void testarParametros() {}
	
	public String testarParametros(int valor) { return "valor";}
	
	public void exibirNome() {
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
	}
	
	/*
	 * AULA 3 (Assinatura e Sobrecarga de m�todos)
	 * 
	 * Sobrecarga de m�todos:
	 * Pode acontecer de termos m�todos com o mesmo nome, o que chamamos de sobrecarga de m�todos, o que de fato vai diferenci�-los � a sua assinatura, que nunca poder� ser a mesma.
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
	 * AULA 4 (Reescrita de m�todos):
	 * 
	 * A reescrita de m�todos � a releitura de um m�todo existente aplicando a esse m�todo uma implementa��o diferente.
	 * Na reescrita de m�todo � poss�vel reaproveitar o que j� foi feito no m�todo original e aplicar as mudan�as necess�rias para que esse m�todo reescrito atenda seus objetivos
	 * 
	 * A anota��o @Override indica que esse m�todo � reescrito.
	 * 
	 * Criar as classes Pessoa e Cliente e adicionar os m�todos criarPessoa() e mostrarPessoa() para exemplificar essa reescrita.
	 * 
	 */
	
	/*
	 * AULA 5 (Criar mais exemplos de m�todos)
	 */
	
	

}
