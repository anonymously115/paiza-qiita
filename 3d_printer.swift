import Foundation

func main() {
    let input = readLine()!.split(separator: " ").map { Int($0)! }
    let X = input[0]
    let Y = input[1]
    var Z = input[2]
    var S = [[String]](repeating: [], count: Z)

    for z in 0..<Z {
        S[z] = [String]()
        for x in 0..<X {
            S[z].append(readLine()!)
        }
        readLine()
    }

    while Z > 0 {
        Z -= 1
        var t = ""
        for y in 0..<Y {
            var c: Character = "."
            for x in 0..<X {
                if S[Z][x][S[Z][x].index(S[Z][x].startIndex, offsetBy: y)] == "#" {
                    c = "#"
                    break
                }
            }
            t.append(c)
        }
        print(t)
    }
}

main()
