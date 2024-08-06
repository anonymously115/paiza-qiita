#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int strike = 0;
	int ball = 0;
	while (n--) {
		string s;
		cin >> s;
		if (s == "strike")
			cout << (++strike == 3 ? "out!" : "strike!") << endl;
		else if (s == "ball")
			cout << (++ball == 4 ? "fourball!" : "ball!") << endl;
	}
	return 0;
}
