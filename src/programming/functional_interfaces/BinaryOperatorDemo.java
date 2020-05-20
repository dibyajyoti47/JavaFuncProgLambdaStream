package programming.functional_interfaces;

import java.util.List;
import java.util.function.BinaryOperator;

import programming.ReduceDemo;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		//used when you have two arguments to take and return a result
		BinaryOperator<Integer> bo = (x, y) -> x+y;
		System.out.println(bo.apply(12,13));
		
		List<Integer> numbers = List.of(1,2,3,4,5);
		int sum1 = numbers.stream()
					.reduce(0, bo);
		System.out.println(sum1);
	}

}
