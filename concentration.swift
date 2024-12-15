import Foundation

class Concentration {
    private var N: Int
    private var T: [[String]]
    private var acquiredCards: [Int]
    private var P: Int

    init(n: Int, t: [[String]]) {
        self.N = n
        self.T = t
        self.acquiredCards = Array(repeating: 0, count: n)
        self.P = 0
    }

    func getAcquiredCard(_ i: Int) -> Int {
        return acquiredCards[i]
    }

    func concentration(a: Int, b: Int, c: Int, d: Int) {
        if T[a][b] == T[c][d] {
            acquiredCards[P] += 2
        } else {
            P = (P + 1) % N
        }
    }
}

func main() {
    let HWN = readLine()!.split(separator: " ").map { Int($0)! }
    let H = HWN[0], N = HWN[2]

    var T = [[String]]()
    for _ in 0..<H {
        T.append(readLine()!.split(separator: " ").map { String($0) })
    }

    let concentration = Concentration(n: N, t: T)

    let L = Int(readLine()!)!
    for _ in 0..<L {
        let input = readLine()!.split(separator: " ").map { Int($0)! - 1 }
        let (a, b, c, d) = (input[0], input[1], input[2], input[3])
        concentration.concentration(a: a, b: b, c: c, d: d)
    }

    for i in 0..<N {
        print(concentration.getAcquiredCard(i))
    }
}

main()
