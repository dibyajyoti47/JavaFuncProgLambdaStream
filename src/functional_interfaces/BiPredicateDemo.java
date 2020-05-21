package functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, String> bp = (num, name) -> num > 10 && name.length() > 5;
		System.out.println(bp.test(9, "linku"));
	}

}
