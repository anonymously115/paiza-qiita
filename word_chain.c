#include <stdio.h>
#include <stdbool.h>
#include <string.h>

typedef struct word_chain {
	int N;
	char **D;
	bool *alive;
	char bef[11];
	int P;
} WordChain;

void wordChain(WordChain *this, const char *s) {
	if ((strlen(this->bef) && s[0] != this->bef[~-strlen(this->bef)])
			|| s[~-strlen(s)] == 'z')
		this->alive[this->P] = false;
	else {
		for (char **d = this->D;; d++) {
			if (*d) {
				if (!strcmp(*d, s)) {
					strcpy(this->bef, s);
					strcpy(*d, "");
					break;
				}
			} else {
				this->alive[this->P] = false;
				break;
			}
		}
	}
	if (!this->alive[this->P]) {
		this->bef[0] = '\0';
	}
	do {
		this->P = -~this->P % this->N;
	} while (!this->alive[this->P]);
}

int aliveCount(const WordChain *this) {
	int a = 0;
	for (int i = 0; i < this->N; i++) {
		a += this->alive[i];
	}
	return a;
}

int main() {
	int N, K, M;
	scanf("%d %d %d", &N, &K, &M);
	char D[K][11];
	char *d[-~K];
	for (int i = 0; i < K; i++) {
		scanf("%s", D[i]);
		d[i] = D[i];
	}
	d[K] = NULL;
	bool alive[N];
	memset(alive, true, sizeof(alive));
	WordChain wc = { N, d, alive, "", 0 };
	while (M--) {
		char s[11];
		scanf("%s", s);
		wordChain(&wc, s);
	}
	printf("%d\n", aliveCount(&wc));
	for (int i = 0; i < N; i++)
		if (alive[i])
			printf("%d", -~i);
	return 0;
}
