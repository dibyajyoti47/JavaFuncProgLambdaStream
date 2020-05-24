package interfaces_java8;

public class DefaultMethodsExample1 {

	public static String name = "linku";
	public static void main(String[] args) {
		printSomething(System.out::println);
	}
	
	public static void printSomething(DefaultMethodsDemo d) {
		System.out.println("doing something then print below : ");
		d.printName(name);
	}
}
