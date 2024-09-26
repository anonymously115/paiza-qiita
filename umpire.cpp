#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int strike = 3;
	int ball = 4;
	while (n--) {
		string s;
		cin >> s;
		if (s == "strike") cout << (--strike ? "strike!" : "out!") << endl;
		else if (s == "ball") cout << (--ball ? "ball!" : "fourball!") << endl;
	}
	return 0;
}
