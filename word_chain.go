package main

import "fmt"

type WordChain struct {
	N	 int
	D	 map[string]bool
	alive []bool
	bef   string
	P	 int
}

func NewWordChain(n int, d map[string]bool) *WordChain {
	alive := make([]bool, n)
	for i := range alive {
		alive[i] = true
	}
	return &WordChain{
		N:	 n,
		D:	 d,
		alive: alive,
		bef:   "",
		P:	 0,
	}
}

func (wc *WordChain) wordChain(s string) {
	if wc.D[s] && (wc.bef == "" || s[0] == wc.bef[len(wc.bef)-1]) && s[len(s)-1] != 'z' {
		delete(wc.D, s)
		wc.bef = s
	} else {
		wc.alive[wc.P] = false
		wc.bef = ""
	}
	for {
		wc.P = (wc.P + 1) % wc.N
		if wc.alive[wc.P] {
			break
		}
	}
}

func (wc *WordChain) aliveCount() int {
	count := 0
	for _, v := range wc.alive {
		if v {
			count++
		}
	}
	return count
}

func (wc *WordChain) isAlive(i int) bool {
	return wc.alive[i]
}

func main() {
	var N, K, M int
	fmt.Scan(&N, &K, &M)

	D := make(map[string]bool)
	for i := 0; i < K; i++ {
		var d string
		fmt.Scan(&d)
		D[d] = true
	}

	wordChain := NewWordChain(N, D)

	for i := 0; i < M; i++ {
		var s string
		fmt.Scan(&s)
		wordChain.wordChain(s)
	}

	fmt.Println(wordChain.aliveCount())
	for i := 0; i < N; i++ {
		if wordChain.isAlive(i) {
			fmt.Println(i + 1)
		}
	}
}
