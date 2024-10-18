package main
import "fmt"

func leftover(m, p, q float64) float64 {
	return (m * (100 - p) * (100 - q)) / 10000
}

func main() {
	var m, p, q float64
	fmt.Scan(&m, &p, &q)
	fmt.Println(leftover(m, p, q))
}