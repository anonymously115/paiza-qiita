use strict;
use warnings;

package WordChain;

sub new {
    my ($class, $n, $d_ref) = @_;
    my $self = {
        n      => $n,
        d      => $d_ref,
        alive  => [(1) x $n],
        bef    => "",
        p      => 0
    };
    return bless $self, $class;
}

sub wordChain {
    my ($self, $s) = @_;
    my $n = $self->{n};
    if (exists $self->{d}->{$s} && ($self->{bef} eq "" || substr($s, 0, 1) eq substr($self->{bef}, -1)) && substr($s, -1) ne 'z') {
        delete $self->{d}->{$s};
        $self->{bef} = $s;
    } else {
        $self->{alive}->[$self->{p}] = 0;
        $self->{bef} = "";
    }
    do {
        $self->{p} = ($self->{p} + 1) % $n;
    } while (!$self->{alive}->[$self->{p}]);
}

sub aliveCount {
    my ($self) = @_;
    return scalar grep { $_ } @{$self->{alive}};
}

sub isAlive {
    my ($self, $i) = @_;
    return $self->{alive}->[$i];
}

package main;

my ($n, $k, $m);
chomp(my $input = <STDIN>);
($n, $k, $m) = split ' ', $input;

my %d;
while ($k--) {
    chomp(my $word = <STDIN>);
    $d{$word} = 1;
}

my $wordChain = WordChain->new($n, \%d);
while ($m--) {
    chomp(my $word = <STDIN>);
    $wordChain->wordChain($word);
}

print $wordChain->aliveCount(), "\n";
for my $i (0 .. $n - 1) {
    if ($wordChain->isAlive($i)) {
        print $i + 1, "\n";
    }
}
