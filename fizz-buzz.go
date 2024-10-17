package main
import (
	"fmt"
	"strconv"
)

func fizzbuzz(i int) string {
	if i % 3 == 0 && i % 5 == 0 { return "Fizz Buzz" }
	if i % 3 == 0 { return "Fizz" }
	if i % 5 == 0 { return "Buzz" }
	return strconv.Itoa(i)
}

func main() {
	var n int
	fmt.Scan(&n)
	for i := 1; i <= n; i++ {
		fmt.Println(fizzbuzz(i))
	}
}