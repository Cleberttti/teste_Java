package novo;

import java.util.Locale;
import java.util.Scanner;

public class secundario {
	public static void main(String[] args) {
        int n = 0;
        while (n < 5) { // Estrutura repetitiva enquanto (while)
            System.out.println(n);
            n++;
        }
        for (int i = 0; i < 5; i++) { // Estrutura repetitiva for simples
            System.out.println(i);
        }
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do { // Estrutura repetitiva do while
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }

}
