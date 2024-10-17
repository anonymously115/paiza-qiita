#include <iostream>
using namespace std;

string fizzbuzz(int i) {
	if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz";
	if (i % 3 == 0) return "Fizz";
	if (i % 5 == 0) return "Buzz";
	return to_string(i);
}

int main() {
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++)
		cout << fizzbuzz(i) << endl;
	return 0;
}
