use strict;
use warnings;

package Concentration;

sub new {
    my ($class, $n, $t) = @_;
    my $self = {
        N            => $n,
        T            => $t,
        acquiredCards => [(0) x $n],
        P            => 0,
    };
    bless $self, $class;
    return $self;
}

sub concentration {
    my ($self, $a, $b, $c, $d) = @_;
    if ($self->{T}->[$a]->[$b] eq $self->{T}->[$c]->[$d]) {
        $self->{acquiredCards}->[$self->{P}] += 2;
    } else {
        $self->{P} = ($self->{P} + 1) % $self->{N};
    }
}

package main;

my ($H, $W, $N) = split ' ', <>;
chomp($H, $W, $N);
my @T;
for my $i (0 .. $H - 1) {
    my $line = <>;
    chomp($line);
    push @T, [split ' ', $line];
}
my $concentration = Concentration->new($N, \@T);
my $L = <>;
chomp($L);
while ($L-- > 0) {
    my ($a, $b, $A, $B) = split ' ', <>;
    $concentration->concentration($a - 1, $b - 1, $A - 1, $B - 1);
}
for my $i (0 .. $N - 1) {
    print $concentration->{acquiredCards}->[$i], "\n";
}
