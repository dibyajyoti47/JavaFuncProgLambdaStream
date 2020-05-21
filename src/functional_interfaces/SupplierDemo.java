package functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> randomGenerator = () -> {
			return new Random().nextInt(1000);
		};
		System.out.println(randomGenerator.get());
	}

}
