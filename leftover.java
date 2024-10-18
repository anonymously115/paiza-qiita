import java.util.*;

public class Main {
	private static double leftover(double m, double p, double q) {
		return m * (100 - p) * (100 - q) / 10000;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(leftover(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		sc.close();
	}
}
