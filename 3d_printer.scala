import scala.io.StdIn._

object Main extends App {
    val Array(x, y, z) = readLine().split(" ").map(_.toInt)
    val S = Array.ofDim[String](z, x)

    for (i <- 0 until z) {
        S(i) = Array.fill(x)(readLine())
        readLine()
    }

    for (i <- z - 1 to 0 by -1) {
        val t = new StringBuilder()
        for (j <- 0 until y) {
            val c = if ((0 until x).exists(k => S(i)(k)(j) == '#')) '#' else '.'
            t.append(c)
        }
        println(t.toString())
    }
}