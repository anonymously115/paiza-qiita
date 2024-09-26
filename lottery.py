b = int(input())


def lottery(a):
    if a == b: return "first"
    if abs(a - b) == 1: return "adjacent"
    if (a - b) % 10000 == 0: return "second"
    if (a - b) % 1000 == 0: return "third"
    return "blank"


n = int(input())
for i in range(n): print(lottery(int(input())))
