#include <iostream>
#include <iomanip>
using namespace std;

double leftover(double m, double p, double q) {
	return (m * (100 - p) * (100 - q)) / 10000;
}

int main() {
	double m, p, q;
	cin >> m >> p >> q;
	cout << setprecision(7) << leftover(m, p, q) << endl;
	return 0;
}
