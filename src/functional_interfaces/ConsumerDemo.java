package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumeAndPrint = x -> System.out.println(x);
		List<Integer> list = List.of(1,2,3,4,5,6);
		list.stream()
			.forEach(consumeAndPrint);
	}

}
