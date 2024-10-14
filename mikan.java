import java.util.*;

public class Main {
	private static int n;

	private static int mikan(int w) {
		return Math.max((w + n / 2) / n, 1) * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		while (m-- > 0) {
			System.out.println(mikan(sc.nextInt()));
		}
	}
}
