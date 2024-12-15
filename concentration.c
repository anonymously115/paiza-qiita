#include <stdio.h>
#include <string.h>

typedef struct Concentration {
	int N;
	int **T;
	int *acquiredCards;
	int P;
} Concentration;

void concentration(Concentration *C, int a, int b, int c, int d) {
	if (C->T[a][b] == C->T[c][d])
		C->acquiredCards[C->P] += 2;
	else
		C->P = -~C->P % C->N;
}

int main() {
	int H, W, N;
	scanf("%d %d %d", &H, &W, &N);
	int T[H][W];
	int *t[H];
	for (int i = 0; i < H; i++) {
		for (int j = 0; j < W; j++)
			scanf("%d", &T[i][j]);
		t[i] = T[i];
	}
	int acquiredCards[N];
	memset(acquiredCards, 0, sizeof(acquiredCards));
	Concentration c = { N, t, acquiredCards, 0 };
	int L;
	scanf("%d", &L);
	while (L--) {
		int a, b, A, B;
		scanf("%d %d %d %d", &a, &b, &A, &B);
		concentration(&c, --a, --b, --A, --B);
	}
	for (int i = 0; i < N; i++)
		printf("%d\n", c.acquiredCards[i]);
	return 0;
}
