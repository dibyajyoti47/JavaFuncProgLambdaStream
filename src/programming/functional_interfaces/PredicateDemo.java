package programming.functional_interfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven = new Predicate<Integer>() {
			public boolean test(Integer t) {				
				return t % 2 == 0;
			}
		};
		// same as ablove
		Predicate<Integer> isOdd = t -> t%2 != 0;
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		List evenFiltered = list.stream()
								.filter(isEven)
								.collect(Collectors.toList());
		System.out.println(evenFiltered);
		
		List oddFiltered = list.stream()
								.filter(isOdd)
								.collect(Collectors.toList());
		System.out.println(oddFiltered);
	}

}
