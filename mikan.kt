import java.util.*

var n = 0

fun mikan(w: Int): Int {
    return Math.max((w + n / 2) / n, 1) * n
}

fun main() {
	val sc = Scanner(System.`in`)
    n = sc.nextInt()
    var m = sc.nextInt()
    while (m-- > 0) println(mikan(sc.nextInt()))
    sc.close()
}
