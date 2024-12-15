import scala.io.StdIn._

class Concentration(n: Int, t: Array[Array[String]]) {
	private val N: Int = n
	private val T: Array[Array[String]] = t
	private val acquiredCards: Array[Int] = Array.fill(n)(0)
	private var P: Int = 0

	def getAcquiredCard(i: Int): Int = acquiredCards(i)

	def concentration(a: Int, b: Int, c: Int, d: Int): Unit = {
		if (T(a)(b) == T(c)(d)) {
			acquiredCards(P) += 2
		} else {
			P = (P + 1) % N
		}
	}
}

object Main extends App{
	val Array(h, w, n) = readLine().split(" ").map(_.toInt)
	val T = Array.fill(h)(readLine().split(" "))
	val concentration = new Concentration(n, T)
	val L = readInt()
	for (_ <- 0 until L) {
		val Array(a, b, c, d) = readLine().split(" ").map(x => x.toInt - 1)
		concentration.concentration(a, b, c, d)
	}
	for (i <- 0 until n) {
		println(concentration.getAcquiredCard(i))
	}
}
