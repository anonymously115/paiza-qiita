package main

import "fmt"

type Concentration struct {
	N int
	T [][]int
	AcquiredCards []int
	P int
}

func (c *Concentration) Concentration(a, b, x, y int) {
	if c.T[a][b] == c.T[x][y] {
		c.AcquiredCards[c.P] += 2
	} else {
		c.P = (c.P + 1) % c.N
	}
}

func main() {
	var H, W, N int
	fmt.Scan(&H, &W, &N)

	T := make([][]int, H)
	for i := 0; i < H; i++ {
		T[i] = make([]int, W)
		for j := 0; j < W; j++ {
			fmt.Scan(&T[i][j])
		}
	}

	concentration := Concentration{N, T, make([]int, N), 0}

	var L int
	fmt.Scan(&L)
	for L > 0 {
		L--
		var a, b, A, B int
		fmt.Scan(&a, &b, &A, &B)
		concentration.Concentration(a-1, b-1, A-1, B-1)
	}

	for i := 0; i < N; i++ {
		fmt.Println(concentration.AcquiredCards[i])
	}
}
