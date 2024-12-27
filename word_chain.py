class WordChain:
    def __init__(self, n, d):
        self.N = n
        self.D = d
        self.alive = [True] * n
        self.bef = ""
        self.P = 0

    def wordChain(self, s):
        if s in self.D and (not self.bef or self.bef[-1] == s[0]) and s[-1] != 'z':
            self.D.remove(s)
            self.bef = s
        else:
            self.alive[self.P] = False
            self.bef = ""
        self.P = -~self.P % self.N
        while not self.alive[self.P]:
            self.P = -~self.P % self.N


N, K, M = map(int, input().split())
wordChain = WordChain(N, {input() for _ in range(K)})
while M:
    wordChain.wordChain(input())
    M -= 1
print(wordChain.alive.count(True))
for i in range(N):
    if wordChain.alive[i]:
        print(-~i)
