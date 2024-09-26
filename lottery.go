package main
import(
    "fmt"
    "math"
)

var b int

func lottery(a int) string {
	if a == b { return "first"; }
	if int(math.Abs(float64(a - b))) == 1 { return "adjacent"; }
	if (a - b) % 10000 == 0 { return "second"; }
	if (a - b) % 1000 == 0 { return "third"; }
	return "blank";
}

func main() {
	fmt.Scan(&b)
	var n int
	fmt.Scan(&n)
	for i := 0; i < n; i++  {
		var a int;
		fmt.Scan(&a);
		fmt.Println(lottery(a));
	}
}