#include <iostream>
using namespace std;

int main() {
	int b;
	cin >> b;
	int n;
	cin >> n;
	while (n--) {
		int a;
		cin >> a;
		if (a == b)
			cout << "first" << endl;
		else if (a == b - 1 || a == b + 1)
			cout << "adjacent" << endl;
		else if (a % 10000 == b % 10000)
			cout << "second" << endl;
		else if (a % 1000 == b % 1000)
			cout << "third" << endl;
		else
			cout << "blank" << endl;
	}
	return 0;
}
