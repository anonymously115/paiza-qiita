my $b = int(<STDIN>);

sub lottery {
    if ($_[0] == $b) { return "first"; }
    if (abs($_[0] - $b) == 1) { return "adjacent"; }
    if (abs($_[0] - $b) % 10000 == 0) { return "second"; }
    if (abs($_[0] - $b) % 1000 == 0) { return "third"; }
    return "blank";
}

my $n = <STDIN>;
while ($n--) { print lottery(int(<STDIN>)) . "\n"; }