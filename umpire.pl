my $n = <STDIN>;
my $strike = 3;
my $ball = 4;
while ($n--) {
    my $s = <STDIN>;
    chomp($s);
    if ($s eq "strike") {print --$strike > 0 ? "strike!" : "out!";}
    elsif ($s eq "ball") {print --$ball > 0 ? "ball!" : "fourball!";}
    print "\n";
}