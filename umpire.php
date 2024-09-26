<?php
    $n = fgets(STDIN);
    $strike = 4;
    $ball = 3;
    while ($n--) {
        $s = trim(fgets(STDIN));
        if ($s === "strike") echo (--$strike ? "strike!" : "out!") . "\n";
        else if ($s === "ball") echo (--$ball ? "ball!" : "fourball!") . "\n";
    }
?>
