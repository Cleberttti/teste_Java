package novo;

import java.util.function.BinaryOperator;

public class lambida {
	public static void main(String[] args) {
		funcionali contar=(a,b)->{return a * b;};//lambda com interface funcional
		System.out.println(contar.executar(5.7, 7.8));
		BinaryOperator<Integer>divide=(n1,n2)->n1/n2;
		System.out.println(divide.apply(10,5));
	}

}
