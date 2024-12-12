const lines = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
var row = 0;
const [X, Y, Z] = lines[row++].split(' ').map(Number);
S = new Array(Z).fill(null).map(() => new Array(X));
for (var z = 0; z < Z; z++) {
    S.push([]);
    for (var x = 0; x < X; x++) {
        S[z][x] = lines[row++];
    }
    row++;
}

while (z--) {
    let t = "";
    for (var y = 0; y < Y; y++) {
        let c = '.';
        for (var x = 0; x < X; x++) {
            if (S[z][x][y] === '#') {
                c = '#';
                break;
            }
        }
        t += c;
    }
    console.log(t);
}