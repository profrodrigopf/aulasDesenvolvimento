package aulasDesenvolvimento.objetos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarGregoriano {
	
	public static void main(String[] args) {
		
		Calendar calendario = new GregorianCalendar();
		calendario.set(Calendar.DAY_OF_MONTH, 9);
		calendario.set(Calendar.MONTH, 4);
		calendario.set(Calendar.YEAR, 1976);
		
		DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Data Nascimento: " + dataFormatada.format(calendario.getTime()));
		
	}

}
