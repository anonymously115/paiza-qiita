import scala.io.StdIn._

object Main extends App {
    def leftover(m: Double, p: Double, q: Double): Double = {
        return m * (100 - p) * (100 - q) / 10000
    }

    val Array(m, p, q) = readLine().split(" ").map(_.toDouble)
    println(leftover(m, p, q))
}