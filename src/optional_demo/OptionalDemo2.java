package optional_demo;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("linku");
		optional
			.filter(name -> name.length() > 4)
			.ifPresentOrElse(System.out::println, ()-> System.out.println("not valid"));
	}

}
