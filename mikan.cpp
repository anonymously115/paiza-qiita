#include <iostream>
#include <algorithm>
using namespace std;

int n;

int mikan(int w) {
	return max((w + n / 2) / n, 1) * n;
}

int main() {
	int m;
	cin >> n >> m;
	while (m--) {
		int w;
		cin >> w;
		cout << mikan(w) << endl;
	}
	return 0;
}
