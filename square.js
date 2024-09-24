const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
console.log("*".repeat(lines[0]));