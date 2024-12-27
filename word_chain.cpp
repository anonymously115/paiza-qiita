#include <iostream>
#include <vector>
#include <set>
using namespace std;

class WordChain {
	int N;
	set<string> &D;
	vector<bool> alive;
	string bef;
	int P;
public:
	WordChain(int n, set<string> &d) :
			N(n), D(d), bef(""), P(0) {
		alive.resize(n, true);
	}

	void wordChain(const string &s) {
		if (D.count(s) && (bef == "" || s.front() == bef.back())
				&& s.back() != 'z') {
			D.erase(s);
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
		int B = 0;
		for (bool b : alive)
			B += b;
		return B;
	}

	bool isAlive(int i) {
		return alive[i];
	}
};

int main() {
	int N, K, M;
	cin >> N >> K >> M;
	set<string> D;
	while (K--) {
		string d;
		cin >> d;
		D.insert(d);
	}
	WordChain wordChain(N, D);
	while (M--) {
		string s;
		cin >> s;
		wordChain.wordChain(s);
	}
	cout << wordChain.aliveCount() << endl;
	for (int i = 0; i < N; i++)
		if (wordChain.isAlive(i))
			cout << -~i << endl;
	return 0;
}
