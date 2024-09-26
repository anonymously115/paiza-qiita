const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
const b = Number(lines[0]);

function lottery(a) {
    if (a === b) return "first";
    if (Math.abs(a - b) === 1) return "adjacent";
    if ((a - b) % 10000 === 0) return "second";
    if ((a - b) % 1000 === 0) return "third";
    return "blank";
}

const n = Number(lines[1]);
for (var i = 0; i < n; i++) console.log(lottery(Number(lines[i + 2])));
