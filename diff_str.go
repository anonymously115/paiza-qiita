package main
import "fmt"

func main() {
	var a string
	fmt.Scan(&a)
	var b string
	fmt.Scan(&b)
	if a == b { fmt.Println("OK") } else { fmt.Println("NG") }
}