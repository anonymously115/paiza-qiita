import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val num = Array(5) { sc.nextInt() }
    sc.close()
    println(num.min())
}
