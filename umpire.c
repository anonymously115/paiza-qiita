#include <stdio.h>
#include <string.h>

int main() {
	int n;
	scanf("%d", &n);
	int strike = 0;
	int ball = 0;
	while (n--) {
		char s[7];
		scanf("%s", s);
		if (!strcmp(s, "strike"))
			puts(++strike == 3 ? "out!" : "strike!");
		else if (!strcmp(s, "ball"))
			puts(++ball == 4 ? "fourball!" : "ball!");
	}
	return 0;
}
