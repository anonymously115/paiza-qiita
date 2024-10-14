import Foundation

let nm = readLine()!.split(separator: " ").map { Int($0)! }
let n = nm[0]
let m = nm[1]

func mikan(w: Int) -> Int {
    return max((w + n / 2) / n, 1) * n
}

for _ in 0..<m {
    print(mikan(w: Int(readLine()!)!))
}