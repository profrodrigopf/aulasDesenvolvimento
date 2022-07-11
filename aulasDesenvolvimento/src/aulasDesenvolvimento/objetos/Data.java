package aulasDesenvolvimento.objetos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Data {

	// Date vencimento;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * DATA
		 * 
		 * AULA 1 (Date):
		 * 
		 * Como utilizamos data em nosso sistema, bom como sabemos não temos um tipo
		 * primitivo que trabalhe com datas e por isso devemos utilizar uma classe para
		 * isso, no java existem algumas classes que trabalham com datas, como por
		 * exemplo Timestamp, LocalDate, Date, enfim... algumas possibilidades. Vamos
		 * utilizar aqui na aula a classe Date, ok?
		 * 
		 * Vamos ver na prática?
		 * 
		 */

		// Só de instanciar uma data ele já captura a data atual
		Date data = new Date();
		System.out.println(data);

		/*
		 * Mas como podemos ver ele exibe em um formato diferente do nosso habitual,
		 * para configurarmos um formato que seja o nosso habitual devemos utilizar e
		 * configurar um formatador, nele conseguimos definir como queremos utilizar
		 * essas datas.
		 * 
		 * Para utilizar esse formatador também vamos precisar utilizar uma classe
		 * nativa do java que é a DateFormat, a classe DateFormat é uma classe abstrata,
		 * ou seja, ela não pode ser instânciada, por isso vamos utilizar uma de suas
		 * especialistas (filhas) que é a SimpleDateFormat
		 * 
		 */

		DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + dataFormatada.format(data));

		/*
		 * AULA 2 (Capturando uma data e formatando a entrada e saída da data):
		 * 
		 * Bom vamos nesse caso simular a interação do usuário com o sistema informando
		 * uma data a partir do próprio teclado, e aí nesse caso, precisamos entender
		 * que ao digitarmos uma data no teclado o nosso sistema vai receber esse valor
		 * digitado como um texto, ou seja, ele é um tipo String.
		 * 
		 * por isso também vamos precisar configurar um formato de data e depois
		 * converter essa data informada no tipo Date, que a classe de data que estamos
		 * utilizando em nosso sistema.
		 */

		DateFormat dataTeclado = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print("Data Compra: ");

			// Recebendo a data pelo teclado
			String dataDigitada = sc.next();

			// Convertendo o valor do teclado em Date
			Date dataCompra = dataTeclado.parse(dataDigitada);

			// Exibindo o valor digitado no teclado convertido
			System.out.println("Data transformada para Date: " + dataCompra);

			// Exibindo o valor digitado no teclado convertido e configurado para exibição
			System.out.println("Data formatada para exibição: " + dataFormatada.format(dataCompra));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * AULA 3 (Calendar):
		 * 
		 * Criando o objeto Calendar para calculo de datas
		 * 
		 * Podemos utilizar a classe Calendar para montar a nossa data item a item. Por
		 * exemplo, podemos ter em nosso sistema um formulário que recebe a data
		 * separada,um campo para dia outro para mês, outro para ano, ou até mesmo
		 * desmembrar a data nesses campos para facilitar o trabalho com datas.
		 * 
		 * Podemos então utilizar a classe calendar para a montagem desse objeto e assim
		 * conseguir realizar diversos calculos com ela, vamos aos exemplos:
		 * 
		 */

		Calendar cGregoriando = new GregorianCalendar();

		// Vamos capturar o dia de nascimento
		System.out.print("Dia Nascimento: ");
		cGregoriando.set(Calendar.DAY_OF_MONTH, sc.nextInt());

		// Vamos capturar o mês de nascimento
		System.out.print("Mês Nascimento: ");
		cGregoriando.set(Calendar.MONTH, sc.nextInt() - 1);

		// Vamos capturar o ano de nascimento
		System.out.print("Ano Nascimento: ");
		cGregoriando.set(Calendar.YEAR, sc.nextInt());

		// Formatando a data
		DateFormat formatadorAniversario = new SimpleDateFormat("dd/MM/yyyy");

		// Exibindo a data capturada pelo calendar
		System.out.println(formatadorAniversario.format(cGregoriando.getTime()));

		/*
		 * AULA 4 (Calculos de datas):
		 * 
		 * Muitas vezes também há a necessidade de calculos de data, por exemplo do
		 * vencimento de um primeiro boleto, ou juros por atraso, ou descontos por
		 * antecipação de pagamentos, enfim... É possível realizar calculo com datas,
		 * somar ou diminuir dias ou meses por exemplos. E diante desses calculos de
		 * datas, validar descontos ou juros.
		 * 
		 */

		// Realizando o calculo da data, que pode ser pelo dia (DAY_OF_MONTH), pelo mês
		// (MONTH) ou até mesmo pelo ano (YEAR)
		cGregoriando.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatadorAniversario.format(cGregoriando.getTime()));
		
		/*
		 * É possível também adicionar um dia em uma determinada data sem impactar no mês, por exemplo se tivermos a data
		 * de 31/12/2021 e adicionarmos mais um dia, ao invés de ele ir para 01/01/2022 ele volta para 01/12/2021
		 * 
		 * para isso utilizamos o método roll
		 */
		
		cGregoriando.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Adicionando um dia com o método roll: " + formatadorAniversario.format(cGregoriando.getTime()));
		
		
		/*
		 * AULA 5 (Montando exemplo de datas):
		 * 
		 * Criar uma classe com dataDeCompra e dataDeVencimento
		 * 
		 */

	}

}
