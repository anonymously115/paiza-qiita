import java.util.*

class WordChain(val n: Int, val d: MutableSet<String>) {
    private val alive = BooleanArray(n) { true }
    private var bef = ""
    private var p = 0

    fun wordChain(s: String) {
        if (d.contains(s) && (bef.isEmpty() || bef.last() == s.first()) && s.last() != 'z') {
            d.remove(s)
            bef = s
        } else {
            alive[p] = false
            bef = ""
        }
        do {
            p = (p + 1) % n
        } while (!alive[p])
    }

    fun aliveCount(): Int {
        return alive.count { it }
    }

    fun isAlive(i: Int): Boolean {
        return alive[i]
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val m = sc.nextInt()
    val d = mutableSetOf<String>()
    repeat(k) {
        d.add(sc.next())
    }
    val wordChain = WordChain(n, d)
    repeat(m) {
        wordChain.wordChain(sc.next())
    }
    sc.close()

    println(wordChain.aliveCount())
    for (i in 0 until n) {
        if (wordChain.isAlive(i)) {
            println(i + 1)
        }
    }
}
