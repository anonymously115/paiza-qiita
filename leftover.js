function leftover(m, p, q) {
    return m * (100 - p) * (100 - q) / 10000;
}

const [m, p, q] = require("fs").readFileSync("/dev/stdin", "utf8").trim().split(" ").map(Number);
console.log(leftover(m, p, q));