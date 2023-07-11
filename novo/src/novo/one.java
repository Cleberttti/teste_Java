package novo;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		double duplo=2.5;
	       int paraint= (int) duplo; //casting
	       System.out.println(paraint);
	       Scanner entrada=new Scanner(System.in);//entrada de dados
	       System.out.println("teu nome ?");
	       String resposta=entrada.nextLine();//coloca em uma variavel
	       System.out.println(resposta);//imprime
	       entrada.close();//fecha o scanner
	       if(resposta.equalsIgnoreCase("cleber")){//if e else
	        System.out.println("nome certo");//equalsIgnoreCase ignora maiusculo e minusculo 
	       }else{
	        System.out.println("nome errado");
	       }
	       short age=18;
	       switch(age){//switch case
	        case 18:
	        System.out.println("maior");
	        break;
	        case 17:
	        System.out.println("menor");
	        break;
	        default:
	        System.out.println("indefinida");

	       }
	       String ternario=age < 18?"não pode":"pode";//operador ternario
	       System.out.println(ternario);
	    }

	}


