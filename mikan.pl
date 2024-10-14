my ($n, $m) = split ' ', <STDIN>;

sub mikan {
    return (int($_[0] / $n + .5) || 1) * $n;
}

while ($m-- > 0) {
    print mikan(int(<STDIN>)) . "\n";
}