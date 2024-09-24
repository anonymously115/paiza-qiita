package main
import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	var t string
	fmt.Scan(&t)
	fmt.Printf("%s@%s\n", s, t)
}