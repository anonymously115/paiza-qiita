import scala.collection.mutable
import scala.io.StdIn._

class WordChain(n: Int, d: mutable.Set[String]) {
  private val alive = Array.fill(n)(true)
  private var bef = ""
  private var p = 0

  def wordChain(s: String): Unit = {
    if (d.contains(s) && (bef.isEmpty || bef.last == s.head) && s.last != 'z') {
      d -= s
      bef = s
    } else {
      alive(p) = false
      bef = ""
    }
    do {
      p = (p + 1) % n
    } while (!alive(p))
  }

  def aliveCount: Int = alive.count(identity)

  def isAlive(i: Int): Boolean = alive(i)
}

object Main extends App {
  val Array(n, k, m) = readLine().split(" ").map(_.toInt)
  val d = mutable.Set[String]()
  for (_ <- 0 until k) {
    d += readLine().trim
  }
  
  val wordChain = new WordChain(n, d)
  for (_ <- 0 until m) {
    wordChain.wordChain(readLine().trim)
  }

  println(wordChain.aliveCount)
  for (i <- 0 until n if wordChain.isAlive(i)) {
    println(i + 1)
  }
}
