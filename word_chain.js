class WordChain {
    N = 0;
    D = null;
    alive = null;
    bef = "";
    P = 0;

    constructor(n, d) {
        this.N = n;
        this.D = d;
        this.alive = new Array(n).fill(true);
    }

    wordChain(s) {
        if (this.D.has(s) && (this.bef === "" || this.bef[~-this.bef.length] === s[0]) && s[~-s.length] !== 'z') {
            this.D.delete(s);
            this.bef = s;
        } else {
            this.alive[this.P] = false;
            this.bef = "";
        }
        do {
            this.P = -~this.P % -~this.N;
        } while (!this.alive[this.P]);
    }
}


const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
const [N, K, M] = lines[0].split(" ").map(Number);
const D = new Set();
for (var k = 1; k <= K; k++) D.add(lines[k]);
const wordChain = new WordChain(N, D);
for (var m = 1; m <= M; m++) wordChain.wordChain(lines[K + m]);
console.log(wordChain.alive.filter(b => b).length)
for (var i = 0; i < N; i++) if (wordChain.alive[i]) console.log(-~i);