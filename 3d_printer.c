#include <stdio.h>

int main() {
	int X, Y, Z;
	scanf("%d %d %d", &X, &Y, &Z);
	char S[Z][X][Y + 1];
	for (int z = 0; z < Z; z++) {
		for (int x = 0; x < X; x++) {
			scanf("%s", S[z][x]);
		}
		char bar[3];
		scanf("%s", bar);
	}
	while (Z--) {
		for (int y = 0; y < Y; y++) {
			char c = '.';
			for (int x = 0; x < X; x++) {
				if (S[Z][x][y] == '#') {
					c = '#';
					break;
				}
			}
			putchar(c);
		}
		puts("");
	}
	return 0;
}
