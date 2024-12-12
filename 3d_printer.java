import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		String[][] S = new String[Z][];
		for (int z = 0; z < Z; z++) {
			S[z] = new String[X];
			for (int x = 0; x < X; x++) {
				S[z][x] = sc.next();
			}
			sc.next();
		}
		while (Z-- > 0) {
			String t = "";
			for (int y = 0; y < Y; y++) {
				char c = '.';
				for (int x = 0; x < X; x++) {
					if (S[Z][x].charAt(y) == '#') {
						c = '#';
						break;
					}
				}
				t += c;
			}
			System.out.println(t);
		}
	}
}
