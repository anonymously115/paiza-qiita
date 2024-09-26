import java.util.*;

public class Main {
	private static int b;

	private static String lottery(int a) {
		if (a == b) return "first";
		if (Math.abs(a - b) == 1) return "adjacent";
		if ((a - b) % 10000 == 0) return "second";
		if ((a - b) % 1000 == 0) return "third";
		return "blank";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		int n = sc.nextInt();
		while (n-- > 0) System.out.println(lottery(sc.nextInt()));
	}
}
