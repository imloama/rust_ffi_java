package main
import (
	"C"
	"fmt"
)
//export Sum
func Sum(a int, b int) int {
    return a + b
}
func main() {
	fmt.Println("hello, golang!")
}