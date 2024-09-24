const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
console.log(lines[0] === lines[1] ? "OK" : "NG");