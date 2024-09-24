const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
const [a, b] = lines[0].split(" ").map(Number);
console.log(a + b);