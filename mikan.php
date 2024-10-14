<?php
    global $n;
    [$n, $m] = explode(" ", fgets(STDIN));

    function mikan($w) {
        global $n;
        return max(intdiv($w + intdiv($n, 2), $n), 1) * $n;
    }
    
    while ($m--) echo mikan(fgets(STDIN)) . "\n";
?>
