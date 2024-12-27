import java.util.*;

class WordChain {
	int N;
	Set<String> D;
	boolean[] alive;
	private String bef;
	private int P;

	public WordChain(int n, Set<String> d) {
		N = n;
		D = d;
		alive = new boolean[n];
		for (int i = 0; i < n; i++)
			alive[i] = true;
		bef = "";
		P = 0;
	}

	public void wordChain(String s) {
		if (D.contains(s) && ("".equals(bef) || bef.charAt(~-bef.length()) == s.charAt(0))
				&& s.charAt(~-s.length()) != 'z') {
			D.remove(s);
			bef = s;
		} else {
			alive[P] = false;
			bef = "";
		}
		do {
			P = -~P % N;
		} while (!alive[P]);
	}

	int aliveCount() {
		int a = 0;
		for (boolean b : alive)
			a += (b ? 1 : 0);
		return a;
	}

	boolean isAlive(int i) {
		return alive[i];
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int M = sc.nextInt();
		Set<String> D = new HashSet<String>();
		while (K-- > 0)
			D.add(sc.next());
		WordChain wordChain = new WordChain(N, D);
		while (M-- > 0)
			wordChain.wordChain(sc.next());
		sc.close();
		System.out.println(wordChain.aliveCount());
		for (int i = 0; i < N; i++)
			if (wordChain.isAlive(i))
				System.out.println(-~i);

	}
}
