import java.util.*;

class Concentration {
	int N;
	String[][] T;
	int[] acquiredCards;
	int P;

	public int getAcquiredCard(int i) {
		return acquiredCards[i];
	}

	public Concentration(int n, String[][] t) {
		N = n;
		T = t;
		acquiredCards = new int[n];
		P = 0;
	}

	public void concentration(int a, int b, int c, int d) {
		if (T[a][b].equals(T[c][d]))
			acquiredCards[P] += 2;
		else
			P = -~P % N;
	}
};

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		String[][] T = new String[H][W];
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++)
				T[i][j] = sc.next();
		Concentration concentration = new Concentration(N, T);
		int L = sc.nextInt();
		while (L-- > 0) {
			concentration.concentration(~-sc.nextInt(), ~-sc.nextInt(), ~-sc.nextInt(), ~-sc.nextInt());
		}
		sc.close();
		for (int i = 0; i < N; i++)
			System.out.println(concentration.getAcquiredCard(i));

	}
}
