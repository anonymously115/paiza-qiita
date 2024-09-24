import scala.io.StdIn._

object Main extends App {
	println((1 to 5).map(_ => readInt()).min)
}