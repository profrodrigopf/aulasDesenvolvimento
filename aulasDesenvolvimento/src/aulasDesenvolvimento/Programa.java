package aulasDesenvolvimento;

public class Programa {

	public static void main(String[] args) {
		
		/*Metodos m = new Metodos();
		System.out.println("Sem passar par�metros");
		m.exibirNome();
		System.out.println("Passando a idade como par�metro");
		m.exibirNome(21);
		System.out.println("Passando a nome como par�metro");
		m.exibirNome("Joel");*/
		/*
		ConversaoAtributo conv = new ConversaoAtributo();
		//System.out.println(conv.testeByte2);
		
		conv.testeConversaoForcada();
		conv.exibirConversaoForcada();*/
		
		/*System.out.println("Valor original:" + conv.valor);
		System.out.println("Valor convertido para inteiro:" + conv.valorAbsoluto);
		System.out.println("Valor inteiro convertido para double: " + conv.valorConvertidoDouble);
		System.out.println("String para double: " + conv.convertStringPInt);*/

		/*EscopoAtributos escopo = new EscopoAtributos();
		escopo.nome = "Maria";
		escopo.testeEscopo(18);*/
		//escopo.idade; Nesse caso eu n�o consigo visualizar a idade da pessoa pq a idade � um atributo local no m�todo que foi chamado
		
		/*Atributos at = new Atributos();
		at.testeValor();*/
		
		TestandoConstrutoresWrappers teste = new TestandoConstrutoresWrappers();
		Long dataMiliSegundo = new Long(teste.numero);
		Integer diasPagamento = new Integer(teste.textoNumero);
		
		System.out.println(dataMiliSegundo);
		System.out.println(diasPagamento);
		
		
		
	}

}
