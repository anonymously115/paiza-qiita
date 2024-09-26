<?php
	global $b;
    $b = fgets(STDIN);

    function lottery($a) {
        global $b;
        if ($a === $b) return "first";
        if (abs($a - $b) === 1) return "adjacent";
        if (($a - $b) % 10000 == 0) return "second";
        if (($a - $b) % 1000 == 0) return "third";
        return "blank";
    }

    $n = fgets(STDIN);
    while ($n--) echo lottery(fgets(STDIN)) . "\n";
?>
