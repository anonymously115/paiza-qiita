package main
import "fmt"

var n int

func max(a int, b int) int {
	if a > b {return a}
	return b
}

func mikan(w int) int {
	return max((w + n / 2) / n, 1) * n
}

func main() {
	fmt.Scan(&n)
	var m int
	fmt.Scan(&m)
	for i := 0; i < m; i++ {
		var w int
		fmt.Scan(&w)
		fmt.Println(mikan(w))
	}
}