import Foundation

let ab = readLine()!.split(separator: " ").map { Int($0)! }
let a = ab[0]
let b = ab[1]
print(a + b)
