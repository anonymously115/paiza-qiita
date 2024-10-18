import java.util.*

fun leftover(m: Double, p: Double, q: Double): Double {
    return m * (100 - p) * (100 - q) / 10000;
}

fun main() {
	val sc = Scanner(System.`in`)
    println(leftover(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()))
    sc.close()
}
