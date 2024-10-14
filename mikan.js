const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
const [n, m] = lines[0].split(" ").map(Number)

function mikan(w) {
    return Math.max(Math.round(w / n), 1) * n;
}

for (var i = 1; i <= m; i++) console.log(mikan(Number(lines[i])));