import scala.io.StdIn._

object Main extends App {
    def fizzbuzz(i: Int): String = {
        if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz"
        if (i % 3 == 0) return "Fizz"
        if (i % 5 == 0) return "Buzz"
        return i.toString()
    }

    for (i <- 1 to readInt()) { println(fizzbuzz(i)) }
}