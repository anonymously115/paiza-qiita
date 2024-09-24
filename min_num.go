package main
import "fmt"

func main() {
	var min int
	fmt.Scan(&min)
	for i := 1; i < 5; i++ {
		var num int
		fmt.Scan(&num)
		if num < min {
			min = num
		}
	}
	fmt.Println(min)
}