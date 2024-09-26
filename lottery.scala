import scala.io.StdIn._

object Main extends App {
	val b = readInt()

	def lottery(a: Int): String = {
		if (a == b) "first"
		if (math.abs(a - b) == 1) "adjacent"
		if ((a - b) % 10000 == 0) "second"
		if ((a - b) % 1000 == 0) "third"
		"blank"
	}
	
	val n = readInt()
	for (_ <- 0 until n) {
		println(lottery(readInt()))
	}
}