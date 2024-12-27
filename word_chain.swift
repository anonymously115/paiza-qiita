import Foundation

class WordChain {
    private var n: Int
    private var d: Set<String>
    private var alive: [Bool]
    private var bef: String
    private var p: Int

    init(n: Int, d: Set<String>) {
        self.n = n
        self.d = d
        self.alive = Array(repeating: true, count: n)
        self.bef = ""
        self.p = 0
    }

    func wordChain(_ s: String) {
        if d.contains(s) && (bef.isEmpty || bef.last == s.first) && s.last != "z" {
            d.remove(s)
            bef = s
        } else {
            alive[p] = false
            bef = ""
        }
        repeat {
            p = (p + 1) % n
        } while !alive[p]
    }

    func aliveCount() -> Int {
        return alive.filter { $0 }.count
    }

    func isAlive(_ i: Int) -> Bool {
        return alive[i]
    }
}

let input = readLine()!.split(separator: " ").map { Int($0)! }
let n = input[0]
let k = input[1]
let m = input[2]

var d = Set<String>()
for _ in 0..<k {
    d.insert(readLine()!)
}

let wordChain = WordChain(n: n, d: d)
for _ in 0..<m {
    wordChain.wordChain(readLine()!)
}

print(wordChain.aliveCount())
for i in 0..<n {
    if wordChain.isAlive(i) {
        print(i + 1)
    }
}
