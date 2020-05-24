package interfaces_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingDemo2_WithNull {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Linku", 29));
		students.add(new Student("Swati", 25));
		students.add(new Student("Tinku", 31));
		students.add(new Student("Apurba", 32));
		students.add(null);
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		//null first
		Comparator<Student> nameComparatorWithNullFirst = Comparator.nullsFirst(nameComparator);
		students.sort(nameComparatorWithNullFirst);
		students.forEach(System.out::println);
		
		//null last
		Comparator<Student> nameComparatorWithNullLast = Comparator.nullsLast(nameComparator);
		students.sort(nameComparatorWithNullLast);
		students.forEach(System.out::println);
	}
	
	private static class Student {
		private String name;
		private int age;
		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String toString() {
			return this.name + " : " + this.age;
		}
	}

}

