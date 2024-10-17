sub fizzbuzz {
    if ($_[0] % 3 == 0 && $_[0] % 5 == 0) { return "Fizz Buzz"; }
    if ($_[0] % 3 == 0) { return "Fizz"; }
    if ($_[0] % 5 == 0) { return "Buzz"; }
    return $_[0];
}

my $n = <STDIN>;
for (my $i = 1; $i <= $n; $i++) { print fizzbuzz($i) . "\n"; }
