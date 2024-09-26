#include <stdio.h>
#include <string.h>

int main() {
	int n;
	scanf("%d", &n);
	int strike = 3;
	int ball = 4;
	while (n--) {
		char s[7];
		scanf("%s", s);
		if (!strcmp(s, "strike")) puts(--strike ? "strike!" : "out!");
		else if (!strcmp(s, "ball")) puts(--ball ? "ball!" : "fourball!");
	}
	return 0;
}
