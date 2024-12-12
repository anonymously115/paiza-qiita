<?php
    [$X, $Y, $Z] = explode(" ", trim(fgets(STDIN)));
    $S = [];

    for ($z = 0; $z < $Z; $z++) {
        $S[] = [];
        for ($x = 0; $x < $X; $x++) {
            $S[$z][] = trim(fgets(STDIN));
        }
        fgets(STDIN);
    }

    while ($Z--) {
        for ($y = 0; $y < $Y; $y++) {
            $c = '.';
            for ($x = 0; $x < $X; $x++) {
                if ($S[$Z][$x][$y] === '#') {
                    $c = '#';
                    break;
                }
            }
            echo $c;
        }
        echo "\n";
    }
?>
