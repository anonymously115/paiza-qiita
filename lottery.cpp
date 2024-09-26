#include <iostream>
using namespace std;

int b;

string lottery(int a) {
	if (a == b) return "first";
	if (abs(a - b) == 1) return "adjacent";
	if ((a - b) % 10000 == 0) return "second";
	if ((a - b) % 1000 == 0) return "third";
	return "blank";
}

int main() {
	cin >> b;
	int n;
	cin >> n;
	while (n--) {
		int a;
		cin >> a;
		cout << lottery(a) << endl;
	}
	return 0;
}
