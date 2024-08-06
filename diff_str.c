#include <stdio.h>
#include <string.h>

int main() {
	char a[101];
	scanf("%s", a);
	char b[101];
	scanf("%s", b);
	puts(strcmp(a, b) == 0 ? "OK" : "NG");
	return 0;
}
