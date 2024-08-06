b = int(input())


def result(a):
    if a == b:
        return "first"
    elif a == b - 1 or a == b + 1:
        return "adjacent"
    elif a % 10000 == b % 10000:
        return "second"
    elif a % 1000 == b % 1000:
        return "third"
    else:
        return "blank"


n = int(input())
for i in range(n):
    print(result(int(input())))
