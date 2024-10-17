def fizzbuzz(i):
    if i % 3 == 0 and i % 5 == 0: return "Fizz Buzz"
    if i % 3 == 0: return "Fizz"
    if i % 5 == 0: return "Buzz"
    return i

for i in range(1, -~int(input())): print(fizzbuzz(i))
