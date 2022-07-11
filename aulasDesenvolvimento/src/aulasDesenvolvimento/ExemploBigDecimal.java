package aulasDesenvolvimento;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExemploBigDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * AULA (Calculando valores):
		 * 
		 * 
		 */
		BigDecimal produtoA = new BigDecimal(99.90);
		BigDecimal produtoB = new BigDecimal(110.90);
		BigDecimal qtdProdA = new BigDecimal(5);
		BigDecimal qtdProdB = new BigDecimal(3);
		
		//Fazendo calculo de produtos - utilizando arredondamento
		System.out.println("Total ProdutoA: " + produtoA.multiply(qtdProdA)/*.setScale(2, RoundingMode.HALF_EVEN)*/);
		System.out.println("Total ProdutoB: " + produtoB.multiply(qtdProdB)/*.setScale(2, RoundingMode.HALF_EVEN)*/);
		
		
		/*
		 * AULA (Comparando valores):
		 * 
		 * Para verificar a igualdade, maior, menor com BigDecimal � necess�rio a utiliza��o do m�todo CompareTo();
		 * 
		 */
		
		BigDecimal numero1;
		BigDecimal numero2;
		
		System.out.print("Numero 1: ");
		//Lendo o primeiro valor
		numero1 = sc.nextBigDecimal();
		
		System.out.print("Numero 2: ");
		//Lendo o segundo valor
		numero2 = sc.nextBigDecimal();
		
		if (numero1.compareTo(numero2) == 0) { //Verifica os conte�dos das vari�veis e caso o resultado seja = a zero ele entende que s�o iguais
			System.out.println("S�o iguais!");
			
		}else if (numero1.compareTo(numero2) > 0) { //Verifica os conte�dos das vari�veis e caso o resultado seja > que zero ele entende que o numero1 � o maior
			System.out.println("Numero 1 � o maior: ");
			
		} else { //Caso nenhuma das verifica��es anteriores seja satisfeita ele entra no else
			System.out.println("N�mero 2 � o maior: ");
		}

	}

}
