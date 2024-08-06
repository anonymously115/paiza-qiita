#include <stdio.h>

int max(int a, int b) {
	return a > b ? a : b;
}

int main() {
	int n, m;
	scanf("%d %d", &n, &m);
	while (m--) {
		int w;
		scanf("%d", &w);
		printf("%d\n", max((w + n / 2) / n, 1) * n);
	}
	return 0;
}
