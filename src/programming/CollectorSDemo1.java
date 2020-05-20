package programming;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorSDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,3,4);
		List<Integer> sqrdNums = numbers.stream()
									.map(x -> x*x)
									.collect(Collectors.toList());
		sqrdNums.stream().forEach(System.out::println);
	}

}
