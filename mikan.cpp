#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	while (m--) {
		int w;
		cin >> w;
		cout << max((w + n / 2) / n, 1) * n << endl;
	}
	return 0;
}
