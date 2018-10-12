
public class Runner {
	public static void main(String[] args) {
	}

	public static int adder(final int x, final int y) {
		return (x + y);
	}

	public static int multi(final int x, final int y) {
		return (x * y);
	}

	public static int div(final int x, final int y) {
		return (x / y);
	}

	public static int sub(final int x, final int y) {
		return (x - y);
	}

	public static int combo(final int x, final int y, final String z) {
		switch (z) {
		case "+":
			return (x + y);
		case "*":
			return (x * y);
		case "/":
			return (x / y);
		case "-":
			return (x - y);
		default:
			return (0000000);
		}
	}
}
