const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
const n = Number(lines[0]);
var strike = 3;
var ball = 4;
for (var i = 1; i <= n; i++) {
    const s = lines[i];
    if (s === "strike") console.log(--strike ? "strike!" : "out!");
    else if (s === "ball") console.log(--ball ? "ball!" : "fourball!");
}
