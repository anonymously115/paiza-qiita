import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int strike = 3;
		int ball = 4;
		while (n-- > 0) {
			String s = sc.next();
			if ("strike".equals(s)) System.out.println(--strike > 0 ? "strike!" : "out!");
			else if ("ball".equals(s)) System.out.println(--ball > 0 ? "ball!" : "fourball!");
		}
		sc.close();
	}
}
