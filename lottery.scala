import scala.io.StdIn._

object Main extends App {
	val b = readInt()

	def lottery(a: Int): String = {
		if (a == b) return "first"
		if (math.abs(a - b) == 1) return "adjacent"
		if ((a - b) % 10000 == 0) return "second"
		if ((a - b) % 1000 == 0) return "third"
		return "blank"
	}
	
	val n = readInt()
	for (_ <- 0 until n) {
		println(lottery(readInt()))
	}
}