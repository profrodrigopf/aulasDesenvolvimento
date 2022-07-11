package aulasDesenvolvimento.objetos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaObjetos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		DateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatoSaida.format(hoje));
		
		Pessoa pessoa = new Pessoa();
		System.out.print("Nome: ");
		pessoa.nome = sc.next();
		
		System.out.print("E-mail: ");
		pessoa.email = sc.next();
		
		System.out.print("Informe a data de nascimento: ");
		String dataNasc = sc.next();
		
		DateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			System.out.println("Converter a data de string para date");
			pessoa.dataNascimento = formatoEntrada.parse(dataNasc);
			
			System.out.println("Nome: " + pessoa.nome);
			System.out.println("E-mail: " + pessoa.email);
			System.out.println("Data Nascimento: " + formatoSaida.format(pessoa.dataNascimento));
			
		} catch (ParseException e) {
			System.out.println("Data inválida! Ex.: 01/10/1900 " + e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
