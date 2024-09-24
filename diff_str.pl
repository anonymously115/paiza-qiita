my $a = <STDIN>;
chomp($a);
my $b = <STDIN>;
chomp($b);
print $a eq $b ? "OK\n" : "NG\n";