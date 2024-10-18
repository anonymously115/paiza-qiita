#include <stdio.h>

double leftover(double m, double p, double q) {
	return (m * (100 - p) * (100 - q)) / 10000;
}

int main() {
	double m, p, q;
	scanf("%lf %lf %lf", &m, &p, &q);
	printf("%.4lf\n", leftover(m, p, q));
	return 0;
}
