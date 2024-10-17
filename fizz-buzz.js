const n = require("fs").readFileSync("/dev/stdin", "utf8");

function fizzbuzz(i) {
    if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz";
    if (i % 3 == 0) return "Fizz";
    if (i % 5 == 0) return "Buzz";
    return i;
}

for (var i = 1; i <= n; i++) console.log(fizzbuzz(i));