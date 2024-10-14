#include <stdio.h>

int n;

int max(int a, int b) {
	return a > b ? a : b;
}

int mikan(int w) {
	return max((w + n / 2) / n, 1) * n;
}

int main() {
	int m;
	scanf("%d %d", &n, &m);
	while (m--) {
		int w;
		scanf("%d", &w);
		printf("%d\n", mikan(w));
	}
	return 0;
}
