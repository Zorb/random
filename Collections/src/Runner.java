import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void main(String[] args) {

		unisq();
	}

	public static void hundred() {
		int x = 1;
		int[] arr = new int[100];

		while (x < 101) {
			arr[x] = x;
			x += 1;
		}

	}

	public static void thousand() {
		int x = 100;
		ArrayList<Integer> listA = new ArrayList<>();
		while (x < 1000) {
			listA.add(x);
			x += 1;
		}

	}

	public static void iterate(List<Integer> listA) {
		for (int i = 0; i < listA.size(); i++) {
			listA.set(i, listA.get(i) * 10);
		}
	}

	public static void printall() {
		numbers.stream().forEach(System.out::println);

	}

	public static void even() {
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}

	public static void ten() {
		numbers.stream().map(x -> x * 10).forEach(System.out::println);
	}

	public static void max() {
		System.out.println(Collections.max(numbers));
	}

	public static void min() {
		System.out.println(Collections.min(numbers));
	}

	public static void sq() {
		List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		squares.forEach(System.out::println);

	}

	public static void unisq() {
		List<Integer> squares = numbers.stream().distinct().map(x -> x * x).collect(Collectors.toList());
		squares.forEach(System.out::println);

	}
}
