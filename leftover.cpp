#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	int m, p, q;
	cin >> m >> p >> q;
	cout << fixed << setprecision(4)
			<< (double) (m * (100 - p) * (100 - q)) / 10000 << endl;
	return 0;
}
