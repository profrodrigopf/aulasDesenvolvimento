package aulasDesenvolvimento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TesteBigDecimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AulaBigDecimal bDecimal = new AulaBigDecimal();
		
		System.out.println("Pre�o: " + bDecimal.getPrecoComImposto());
		
		//Adi��o
		BigDecimal precoFinal = bDecimal.getPrecoComImposto().add(new BigDecimal(3.21));
		System.out.println("Soma: " + precoFinal.setScale(1, RoundingMode.HALF_EVEN));
		
		//Subtracao
		precoFinal = bDecimal.getPrecoComImposto().subtract(new BigDecimal(2.5));
		System.out.println("Subtra��o: " + precoFinal);
		//private BigDecimal precoTotal = preco.add(precoComImposto); //Soma com BigDecimal
		
		
		//Divis�o
		precoFinal = bDecimal.getPrecoComImposto().divide(new BigDecimal(2.5));
		System.out.println("Divis�o: " + precoFinal);
		
		//Multiplica��o
		precoFinal = bDecimal.getPrecoComImposto().multiply(new BigDecimal(2.5));
		System.out.println("Multiplica��o: " + precoFinal);
		
		System.out.print("N�mero 1: ");
		BigDecimal valor1 = sc.nextBigDecimal();
		
		System.out.print("N�mero 2: ");
		BigDecimal valor2 = sc.nextBigDecimal();
		
		if(valor1.compareTo(valor2) > 0) {
			System.out.println("N�mero 1 � maior: " + valor1);
		}else if(valor2.compareTo(valor1) > 0) {
			System.out.println("N�mero 2 � maior: " + valor2);
		}else {
			System.out.println("S�o iguais: " + "\nN�mero 1 = " + valor1 + "\n" + "Numero 2 = " + valor2);
		}
		
	}

}
