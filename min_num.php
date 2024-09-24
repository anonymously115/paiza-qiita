<?php
	$num = [];
    for ($i = 0; $i < 5; $i++) {
        $num[] = fgets(STDIN);
    }
    echo min($num);
?>
