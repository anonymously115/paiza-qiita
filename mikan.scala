import scala.io.StdIn._

object Main extends App {
    val Array(n, m) = readLine().split(" ").map(_.toInt)

    def mikan(w: Int): Int = {
        Math.max((w + n / 2) / n, 1) * n
    }

    for (_ <- 0 until m) {
        println(mikan(readInt()))
    }
}