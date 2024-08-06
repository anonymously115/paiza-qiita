#include <stdio.h>

int main() {
	int b;
	scanf("%d", &b);
	int n;
	scanf("%d", &n);
	while (n--) {
		int a;
		scanf("%d", a);
		if (a == b)
			puts("first");
		else if (a == b - 1 || a == b + 1)
			puts("adjacent");
		else if (a % 10000 == b % 10000)
			puts("second");
		else if (a % 1000 == b % 1000)
			puts("third");
		else
			puts("blank");
	}
	return 0;
}
