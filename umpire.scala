import scala.io.StdIn._

object Main extends App {
	val n = readInt()
	var strike = 3
	var ball = 4
	
	for (_ <- 0 until n) {
		val s = readLine()
		if (s == "strike") {
			strike -= 1
			println(if (strike > 0) "strike!" else "out!")
		} else if (s == "ball") {
			ball -= 1
			println(if (ball > 0) "ball!" else "fourball!")
		}
	}
}
