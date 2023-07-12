package novo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class lambida {
	public static void main(String[] args) {
		funcionali contar=(a,b)->{return a * b;};//lambda com interface funcional
		System.out.println(contar.executar(5.7, 7.8));
		BinaryOperator<Integer>divide=(n1,n2)->n1/n2;
		System.out.println(divide.apply(10,5));
		Predicate<Integer>pergunta=x -> x > 1;
		System.out.println(pergunta.test(1));
		Function<Integer, String>par_impar=n -> n % 2 == 0 ? "par":"impar";
		System.out.println(par_impar.apply(50));
		UnaryOperator<String>maiusculo=p -> p.toUpperCase();
		System.out.println(maiusculo.apply("ola mundo"));
		BiFunction<Double,Double,String>resultado=(n1,n2)->((n1+n2)/2)>=7?"p":"r";
		System.out.println(resultado.apply(8.5, 4.7));
	}

}
