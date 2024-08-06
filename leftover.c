#include <stdio.h>

int main() {
	int m, p, q;
	scanf("%d %d %d", &m, &p, &q);
	printf("%.4lf\n", (double) (m * (100 - p) * (100 - q)) / 10000);
	return 0;
}
