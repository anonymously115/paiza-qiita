#include <stdio.h>
#include <stdlib.h>

int b;

char* lottery(int a) {
	if (a == b) return "first";
	if (abs(a - b) == 1) return "adjacent";
	if ((a - b) % 10000 == 0) return "second";
	if ((a - b) % 1000 == 0) return "third";
	return "blank";
}

int main() {
	scanf("%d", &b);
	int n;
	scanf("%d", &n);
	while (n--) {
		int a;
		scanf("%d", &a);
		puts(lottery(a));
	}
	return 0;
}
