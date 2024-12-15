#include <iostream>
#include <vector>
using namespace std;

class Concentration {
	int N;
	vector<vector<string>> &T;
	vector<int> acquiredCards;
	int P;
public:
	int getAcquiredCard(int i) {
		return acquiredCards[i];
	}
	Concentration(int n, vector<vector<string>> &t) :
			N(n), T(t), P(0) {
		acquiredCards.resize(N);
	}
	void concentration(int a, int b, int c, int d) {
		if (T[a][b] == T[c][d])
			acquiredCards[P] += 2;
		else
			P = -~P % N;
	}
};

int main() {
	int H, W, N;
	cin >> H >> W >> N;
	vector<vector<string>> T(H, vector<string>(W));
	for (int i = 0; i < H; i++)
		for (int j = 0; j < W; j++)
			cin >> T[i][j];
	Concentration concentration(N, T);
	int L;
	cin >> L;
	while (L--) {
		int a, b, A, B;
		cin >> a >> b >> A >> B;
		concentration.concentration(--a, --b, --A, --B);
	}
	for (int i = 0; i < N; i++)
		cout << concentration.getAcquiredCard(i) << endl;
	return 0;
}
