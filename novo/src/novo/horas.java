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
		enumeraçoens dia1=enumeraçoens.QUARTA_FEIRA;//enum
		System.out.println(dia1);
		NewProject p01= new NewProject("rei",2023,"DRAMA","FILME",(long) 800.000);
		System.out.println(p01);
		
		filme f1=new NewProject("g",2022,"comedia","serie",(long) 1.000);//upcasting
		System.out.println(f1);
		veiculos v1=new veiculos("moto","honda","cg",100);
		v1.ligar_turbo();
		v1.desligar_turbo();
		System.out.print(v1);
		
	}

}
