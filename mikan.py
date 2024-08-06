n, m = map(int, input().split())
for _ in range(m):
    print((int(input()) + n // 2) // n * n or n)
    
