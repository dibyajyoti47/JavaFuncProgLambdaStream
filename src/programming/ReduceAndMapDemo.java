package programming;

import java.util.List;

public class ReduceAndMapDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3);
		//to add all squared values
		int result1 = numbers.stream()
				.reduce(0, (x,y) -> x + y*y);
		System.out.println(result1);
		
		//to add all squared values using map
		int result2 = numbers.stream()
				.map(x -> x*x)
				.reduce(0, (x,y) -> x + y);
		System.out.println(result2);
	}

}
