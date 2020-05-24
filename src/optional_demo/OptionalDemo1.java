package optional_demo;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("Linku");
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.map(str -> str.toUpperCase()).get());
		optional = Optional.ofNullable(null);
		System.out.println(optional.map(str -> str.toUpperCase()).orElse("default1"));
		System.out.println(optional.map(str -> str.toUpperCase()).orElseGet(()-> "default2"));
		try {System.out.println(optional.map(str -> str.toUpperCase()).orElseThrow(()-> new RuntimeException("not found")));} catch (RuntimeException e) {System.out.println(e.getMessage());}
		optional = Optional.ofNullable("Linku 2");
		if (optional.isPresent()) System.out.println(optional.get());
		optional.ifPresent(System.out::println);
		optional = Optional.ofNullable(null);
		optional.ifPresentOrElse(System.out::println, () -> System.out.println("it's null"));
	}

}
