#include <stdio.h>

char* fizzbuzz(char *s, int i) {
	if (i % 3 == 0 && i % 5 == 0)
		sprintf(s, "Fizz Buzz");
	else if (i % 3 == 0)
		sprintf(s, "Fizz");
	else if (i % 5 == 0)
		sprintf(s, "Buzz");
	else
		sprintf(s, "%d", i);
	return s;
}

int main() {
	int n;
	scanf("%d", &n);
	char s[11];
	for (int i = 1; i <= n; i++)
		puts(fizzbuzz(i));
	return 0;
}
