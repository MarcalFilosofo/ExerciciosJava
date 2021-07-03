package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 6.0));
	}
}
