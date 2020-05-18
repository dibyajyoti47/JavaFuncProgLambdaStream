package programming;

import java.util.List;

public class FPO1Structured {

	public static void main(String[] args) {
	//	printAllNumbersInListStructured(List.of(1, 2, 3, 4, 21, 32, 23, 44, 51, 87, 34, 43));
		printAllNumbersInFunctionalApproach(List.of(1, 2, 3, 4, 21, 32, 23, 44, 51, 87, 34, 54));
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

}
