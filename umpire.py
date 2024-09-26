n = int(input())
strike = 3
ball = 4
for _ in range(n):
    s = input()
    if s == "strike":
        strike -= 1
        print("strike!" if strike else "out!")
    elif s == "ball":
        ball -= 1
        print("ball!" if ball else "fourball!")
