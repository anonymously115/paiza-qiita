sub leftover {
    return $_[0] * (100 - $_[1]) * (100 - $_[2]) / 10000;
}

my ($m, $p, $q) = split ' ', <STDIN>;
print leftover($m, $p, $q) . "\n";