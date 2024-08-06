#include <stdio.h>

int chmin(int *a, int b) {
	if (b < *a)
		*a = b;
	return a;
}

int main() {
	int min;
	scanf("%d", &min);
	for (int i = 1; i < 5; i++) {
		int num;
		scanf("%d", &num);
		chmin(&min, num);
	}
	printf("%d\n", min);
	return 0;
}
