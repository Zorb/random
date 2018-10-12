import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {
	public static void main(String[] args) {
		ten();
	}

	public static void ten() {
		// int x = 1;
		// while (x < 11) {
		// System.out.println(x);
		// x += 1;
		// }
		List<Integer> range = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		range.stream().forEach(System.out::println);
	}

	public static void thousand() {
		// int x = 100;
		// while (x < 999) {
		// System.out.println(x);
		// x += 1;
		// }
		List<Integer> range = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
		range.stream().forEach(System.out::println);

	}

	public static void tenwords() {
		int x = 1;
		while (x < 10) {
			switch (x) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;

			default:
				System.out.println("Wrong");
				break;
			}
			x += 1;
		}

	}

	public static void hundredwords() {

		System.out.println("one and one hundred");

	}

	public static void thousandwords() {

		System.out.println("One and One Thousand");

	}
}
