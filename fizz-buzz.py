print(*[(("Fizz" if i % 3 == 0 else "") + " " + ("Buzz" if i % 5 == 0 else "")).strip() or i for i in range(1, -~int(input()))], sep='\n')
