import Foundation

func leftover(m: Double, p: Double, q: Double) -> Double {
    return m * (100 - p) * (100 - q) / 10000
}

let mpq = readLine()!.split(separator: " ").map { Double($0)! }
print(leftover(m: mpq[0], p: mpq[1], q: mpq[2]))