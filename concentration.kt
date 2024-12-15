import java.util.*

class Concentration {
	var N: Int
	var T: Array<Array<String>>
	var acquiredCards: Array<Int>
	var P: Int

	fun getAcquiredCards(i: Int): Int {
		return acquiredCards[i]
	}

	constructor(n: Int, t: Array<Array<String>>) {
		this.N = n
		this.T = t
		this.acquiredCards = Array(n) { 0 }
		this.P = 0
	}

	fun concentration(a: Int, b: Int, c: Int, d: Int) {
		if (T[a][b].equals(T[c][d])) {
			this.acquiredCards[this.P] += 2
		} else {
			this.P = (this.P + 1) % this.N
		}
	}
}

fun main() {
	val sc = Scanner(System.`in`)
	val H = sc.nextInt()
	val W = sc.nextInt()
	val N = sc.nextInt()
	val T = Array(H){ Array(W) { "" }}
	for (i in 0 until H) {
		for (j in 0 until W) {
			T[i][j] = sc.next()
		}
	}
	val concentration = Concentration(N, T)
	val L = sc.nextInt()
	for (i in 1..L) {
		concentration.concentration(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt() - 1)
	}
	sc.close()
	for (i in 0 until N) {
		println(concentration.getAcquiredCards(i))
	}	
}
