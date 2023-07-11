package novo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class horas {
	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();//data atual
		LocalDateTime d2=LocalDateTime.now();//com hora
		Instant d3=Instant.now();//padrao gmt
		DateTimeFormatter d4=DateTimeFormatter.ofPattern("dd/MM/yyyy");//formata
		String d5=LocalDateTime.now().format(d4); //formatado
		LocalDate d6=LocalDate.ofInstant(d3,ZoneId.systemDefault());//converte
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d5);
		System.out.println(d6);
		
	}

}
