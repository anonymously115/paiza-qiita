#include <stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	for (int i = 1; i <= n; i++)
		if (i % 3 == 0 && i % 5 == 0)
			puts("Fizz Buzz");
		else if (i % 3 == 0)
			puts("Fizz");
		else if (i % 5 == 0)
			puts("Buzz");
		else
			printf("%d\n", i);
	return 0;
}
