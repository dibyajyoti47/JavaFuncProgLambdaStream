package functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, String, String> bf = (num, name) -> "" + (num > 10 && name.length() > 5);
		System.out.println(bf.apply(9, "lkuu"));
	}

}
