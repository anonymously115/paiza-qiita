<?php
    function leftover($m, $p, $q) {
        return $m * (100 - $p) * (100 - $q) / 10000;
    }

    [$m, $p, $q] = explode(" ", fgets(STDIN));
    echo leftover($m, $p, $q) . "\n";
?>
