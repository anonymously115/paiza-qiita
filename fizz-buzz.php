<?php
    function fizzbuzz($i) {
		if ($i % 3 == 0 && $i % 5 == 0) return "Fizz Buzz";
		if ($i % 3 == 0) return "Fizz";
		if ($i % 5 == 0) return "Buzz";
		return $i;
    }

    $n = fgets(STDIN);
    for ($i = 1; $i <= $n; $i++) echo fizzbuzz($i) . "\n";
?>
