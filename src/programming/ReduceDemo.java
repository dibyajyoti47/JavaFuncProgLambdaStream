package programming;

import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		int sum1 = numbers.stream()
					.reduce(0, ReduceDemo::addNums);
		int sum2 = numbers.stream()
					.reduce(0, (a, b) -> a+b);
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	private static int addNums (int a, int b) {
		return a+b;
	}
}
