package programming.functional_interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceDemo {
	
	public static void main(String[] args) {
		 /**
		 * @param t the function argument
	     * @return the function result
	     */
		//used when you have one argument to take and return a result
		Function<Integer, Integer> getSquare = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		
		List<Integer> list = List.of(1,2,3,4,5,6);
		list.stream()
			.map(getSquare)
			.forEach(System.out::println);
		
		Function<Integer, String> getText = x -> x + " : " + x;
		list.stream()
			.map(getText)
			.forEach(System.out::println);
	}

}
