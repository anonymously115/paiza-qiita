class Concentration {
    N = 0;
    T = null;
    acquiredCards = null;
    P = 0;
    getAcquiredCards(i) {
        return this.acquiredCards[i];
    }
    constructor(n, t) {
        this.N = n;
        this.T = t;;
        this.acquiredCards = new Array(n).fill(0);
        this.P = 0;
    }
    concentration(a, b, c, d) {
        if (T[a][b] === T[c][d]) this.acquiredCards[P] += 2;
        else P = -~P % this.N;
    }
}

const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
let _ = 0;
const [H, W, N] = lines[_++].split(' ').map(Number);
const T = [];
for (var i = 0; i < H; i++)T.push(lines[_++].split(' '));
const concentration = new Concentration(N, T);
let L = Number(lines[_++]);
while (L--) {
    let [a, b, A, B] = lines[row++].split(" ").map(x => Number(x) - 1);
    concentration.concentration(a, b, A, B);
}
for (var i = 0; i < N; i++)console.log(concentration.getAcquiredCards(i));
