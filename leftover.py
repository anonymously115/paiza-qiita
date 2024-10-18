def leftover(m, p, q):
    return m * (100 - p) * (100 - q) / 10000


m, p, q = map(float, input().split())
print(leftover(m, p, q))
