package programming.functional_interfaces;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
	UnaryOperator<Integer> unaryOperator = x -> x*10;
	List<Integer> numbers = List.of(1,2,3,4,5,6);
	numbers.stream()
			.map(unaryOperator)
			.forEach(System.out::println);
	}

}
