package programming.functional_interfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CinstructorReferenceDemo {

	public static void main(String[] args) {
		Supplier<A> supplier = A::new;		
		System.out.println(supplier.get());
	}

}

class A {
	@Override
	public String toString() {		
		return "just a test";
	}
}