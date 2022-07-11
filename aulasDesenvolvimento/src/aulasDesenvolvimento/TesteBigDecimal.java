package aulasDesenvolvimento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TesteBigDecimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AulaBigDecimal bDecimal = new AulaBigDecimal();
		
		System.out.println("Preço: " + bDecimal.getPrecoComImposto());
		
		//Adição
		BigDecimal precoFinal = bDecimal.getPrecoComImposto().add(new BigDecimal(3.21));
		System.out.println("Soma: " + precoFinal.setScale(1, RoundingMode.HALF_EVEN));
		
		//Subtracao
		precoFinal = bDecimal.getPrecoComImposto().subtract(new BigDecimal(2.5));
		System.out.println("Subtração: " + precoFinal);
		//private BigDecimal precoTotal = preco.add(precoComImposto); //Soma com BigDecimal
		
		
		//Divisão
		precoFinal = bDecimal.getPrecoComImposto().divide(new BigDecimal(2.5));
		System.out.println("Divisão: " + precoFinal);
		
		//Multiplicação
		precoFinal = bDecimal.getPrecoComImposto().multiply(new BigDecimal(2.5));
		System.out.println("Multiplicação: " + precoFinal);
		
		System.out.print("Número 1: ");
		BigDecimal valor1 = sc.nextBigDecimal();
		
		System.out.print("Número 2: ");
		BigDecimal valor2 = sc.nextBigDecimal();
		
		if(valor1.compareTo(valor2) > 0) {
			System.out.println("Número 1 é maior: " + valor1);
		}else if(valor2.compareTo(valor1) > 0) {
			System.out.println("Número 2 é maior: " + valor2);
		}else {
			System.out.println("São iguais: " + "\nNúmero 1 = " + valor1 + "\n" + "Numero 2 = " + valor2);
		}
		
	}

}
