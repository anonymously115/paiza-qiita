let b = Int(readLine()!)!

func lottery(a: Int) -> String {
	if a == b { return "first" }
	if abs(a - b) == 1 { return "adjacent" }
	if (a - b) % 10000 == 0 { return "second" }
	if (a - b) % 1000 == 0 { return "third" }
	return "blank"
}

for _ in 0..<Int(readLine()!)! { print(lottery(a: Int(readLine()!)!)) }
