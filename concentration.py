class Concentration:
    def __init__(self, n, t):
        self.N = n
        self.T = t
        self.acquiredCards = [0] * n
        self.P = 0

    def concentration(self, a, b, c, d):
        if self.T[a][b] == self.T[c][d]:
            self.acquiredCards[self.P] += 2
        else:
            self.P = -~self.P % self.N


H, W, N = map(int, input().split())
T = [input().split() for _ in range(H)]
concentration = Concentration(N, T)
for _ in range(int(input())):
    a, b, A, B = map(lambda x: ~-int(x), input().split())
    concentration.concentration(a, b, A, B)
for i in range(N):
    print(concentration.acquiredCards[i])
