import java.util.*

var b = 0

fun lottery(a: Int): String {
    if (a == b) return "first"
    if (Math.abs(a - b) == 1) return "adjacent"
    if ((a - b) % 10000 == 0) return "second"
    if ((a - b) % 1000 == 0) return "third"
    return "blank"
}

fun main() {
	val sc = Scanner(System.`in`)
    b = sc.nextInt()
    var n = sc.nextInt()
    while (n-- > 0) println(lottery(sc.nextInt()))
    sc.close()
}
