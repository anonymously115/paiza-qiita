n = int(input())
strike = 0
ball = 0
for _ in range(n):
    s = input()
    if s == "strike":
        strike += 1
        print("out!" if strike == 3 else "strike!")
    elif s == "ball":
        ball += 1
        print("fourball!" if ball == 4 else "ball!")
