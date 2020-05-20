package programming.functional_interfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, String> bc = (x,y) -> System.out.println(x + " : " +y);
		bc.accept(123, " by linku");
	}

}
