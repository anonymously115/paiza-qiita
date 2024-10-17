import java.util.*

fun fizzbuzz(i: Int): String {
    if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz"
    if (i % 3 == 0) return "Fizz"
    if (i % 5 == 0) return "Buzz"
    return i.toString()
}

fun main() {
    val sc = Scanner(System.`in`);
    val n = sc.nextInt()
    sc.close()
    for (i in 1..n) println(fizzbuzz(i))
}
