import java.util.*

fun main() {
    val sc = Scanner(System.`in`);
    var n = sc.nextInt();
    var strike = 3;
    var ball = 4;
    while (n-- > 0) {
        val s = sc.next();
        if ("strike" == s) println(if (--strike > 0) "strike!" else "out!");
        else if ("ball".equals(s)) println(if (--ball > 0) "ball!" else "fourball!");
    }
    sc.close()
}
