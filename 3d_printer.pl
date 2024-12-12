my ($X, $Y, $Z) = split(" ", <STDIN>);
my @S;

for (my $z = 0; $z < $Z; $z++) {
    for (my $x = 0; $x < $X; $x++) {
        chomp(my $line = <STDIN>);
        push @{$S[$z]}, $line;
    }
    <STDIN>;
}

for (my $z = $Z - 1; $z >= 0; $z--) {
    for (my $y = 0; $y < $Y; $y++) {
        my $c = '.';
        for (my $x = 0; $x < $X; $x++) {
            if (substr($S[$z][$x], $y, 1) eq '#') {
                $c = '#';
                last;
            }
        }
        print $c;
    }
    print "\n";
}
