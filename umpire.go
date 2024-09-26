package main
import "fmt"

func main() {
	var n int
	fmt.Scanf(&n)
	strike := 3
	ball := 4
	for i := 0; i < n; i++ {
		var s string
		fmt.Scanf(&s)
		if s == "strike" {
			strike--
			if strike > 0 {
				fmt.Println("strike!")
			} else {
				fmt.Println("out!")
			}
		} else if s == "ball" {
			ball--
			if ball > 0 {
				fmt.Println("ball!")
			} else {
				fmt.Println("fourball!")
			}
		}
	}
}