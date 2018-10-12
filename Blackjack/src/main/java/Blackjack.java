// Given 2 Integer values greater than 0, return whichever value is closest to
// 21 without going over 21. If they both go over 21 then return 0;
public class Blackjack {
	public static void main(String[] args) {
		System.out.println(play(1, 22));
	}

	public static int play(int x, int y) {
		int win = 21;
		if ((x > win && y > win)) {
			return 0;
		} else if ((win - x < win - y) || (y > win)) {
			return x;
		} else if ((win - x > win - y) || (x > win)) {
			return y;
		} else {
			return x;
		}

	}
}