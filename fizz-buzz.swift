import Foundation

func fizzbuzz(i: Int) -> String {
    if i % 3 == 0 && i % 5 == 0 { return "FizzBuzz" }
    if i % 3 == 0 { return "Fizz" }
    if i % 5 == 0 { return "Buzz" }
    return i.description
}

for i in 1...Int(readLine()!)! {
    print(fizzbuzz(i: i))
}