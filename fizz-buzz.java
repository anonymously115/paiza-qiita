import java.util.*;

public class Main {
	private static String fizzbuzz(int i) {
		if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz";
		if (i % 3 == 0) return "Fizz";
		if (i % 5 == 0) return "Buzz";
		return String.valueOf(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) System.out.println(fizzbuzz(i));
	}
}
