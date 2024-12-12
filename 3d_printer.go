package main
import "fmt"

func main() {
	var X, Y, Z int
	
}package main

import "fmt"

func main() {
	var X, Y, Z int
	fmt.Scan(&X, &Y, &Z)

	S := make([][]string, Z)
	for z := 0; z < Z; z++ {
		S[z] = make([]string, X)
		for x := 0; x < X; x++ {
			fmt.Scan(&S[z][x])
		}
		var bar string
		fmt.Scan(&bar) // Read the bar string, not used
	}

	for z := Z - 1; z >= 0; z-- {
		for y := 0; y < Y; y++ {
			c := '.'
			for x := 0; x < X; x++ {
				if S[z][x][y] == '#' {
					c = '#'
					break
				}
			}
    		fmt.Print(string(c))
		}
		fmt.Println()
	}
}
