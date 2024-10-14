n, m = map(int, input().split())


def mikan(w):
    return ((w + n // 2) // n or 1) * n


for _ in range(m):
    print(mikan(int(input())))
