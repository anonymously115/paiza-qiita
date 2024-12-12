import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val X = sc.nextInt()
    val Y = sc.nextInt()
    val Z = sc.nextInt()
    val S = Array(Z) { Array(X) { "" } }

    for (z in 0 until Z) {
        for (x in 0 until X) {
            S[z][x] = sc.next()
        }
        sc.next() // Skip the bar line
    }

    for (z in Z - 1 downTo 0) {
        var t = ""
        for (y in 0 until Y) {
            var c = '.'
            for (x in 0 until X) {
                if (S[z][x][y] == '#') {
                    c = '#'
                    break
                }
            }
            t += c
        }
        println(t)
    }
}
