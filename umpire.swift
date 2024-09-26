let n = Int(readLine()!)!
var strike = 3
var ball = 4
for _ in 0..<n {
	let s = readLine()!
	if s == "strike" {
		strike -= 1
		print(strike > 0 ? "strike!" : "out!")
	} else if s == "ball" {
		ball -= 1
		print(ball > 0 ? "ball!" : "fourball!")
	}
}
