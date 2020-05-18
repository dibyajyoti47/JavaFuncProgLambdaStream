package programming;

import java.util.List;

public class FPO1Structured {

	public static void main(String[] args) {
	//	printAllNumbersInListStructured(List.of(1, 2, 3, 4, 21, 32, 23, 44, 51, 87, 34, 43));
	//	printAllNumbersInFunctionalApproach(List.of(1, 2, 3, 4, 21, 32, 23, 44, 51, 87, 34, 54));
		printEvenNumbersInFunctionalApproach(List.of(1, 2, 3, 4, 21, 32, 23, 44, 51, 87, 34, 54));
	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		for (int number : numbers) { //traditional approach
			System.out.println(number);
		}
	}
		
	private static void printAllNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()  //creating a stream
			.forEach(System.out :: println); //method reference
	}
	
	private static boolean isEven(int num) {
		return num % 2 == 0;
	}
	private static void printEvenNumbersInFunctionalApproach(List<Integer> numbers) {
		numbers.stream()  //creating a stream
	//	.filter(FPO1Structured::isEven) //method reference
		.filter(num -> num%2 == 0)  //lambda expression
		.map(num -> num*num)
		.forEach(System.out :: println); //method reference
	}

}
