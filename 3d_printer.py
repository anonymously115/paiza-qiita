X, Y, Z = map(int, input().split())
S = []
for z in range(Z):
    S.append([])
    for x in range(X):
        S[z].append(input())
    input()
while Z > 0:
    Z -= 1
    t = ""
    for y in range(Y):
        t += '#' if any(S[Z][x][y] == '#' for x in range(X)) else '.'
    print(t)