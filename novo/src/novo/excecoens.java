package novo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class excecoens {
	public static void main(String[] args) {
		try {
	    System.out.println(1/0);
	    }catch (ArithmeticException e) {
			System.out.println("0 e indivizivel");
		}
		System.out.println(conta(5,8));
		Path caminho= Paths.get("C:\\Users\\dougl\\OneDrive\\Área de Trabalho\\Text.txt");
		try {
		byte [] texto = Files.readAllBytes(caminho);
		String leitura=new String(texto);
		System.out.println(leitura);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public static int conta(int a,int b) {
		return a * b;
		
	}
	
}
