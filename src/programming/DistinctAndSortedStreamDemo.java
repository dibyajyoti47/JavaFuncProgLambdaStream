package programming;

import java.util.List;

public class DistinctAndSortedStreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,2,1);
		numbers.stream()
				.distinct()
				.forEach(System.out::println);
		
		List<Integer> numbers2 = List.of(34,123,531,3,531);
		numbers2.stream()
				.sorted()
				.forEach(System.out::println);
	}

}
