<?php
// Your code here!

?>
<?php
	class Concentration
	{
		private $N;
		private $T;
		private $acquiredCards;
		private $P;
		public function getAcquiredCards($i)
		{
			return $this->acquiredCards[$i];
		}
		public function __construct($n, $t)
		{
			$this->N = $n;
			$this->T = $t;
			$this->acquiredCards = array_fill(0, $n, 0);
			$this->P = 0;
		}
	
		public function concentration($a, $b, $c, $d)
		{
			if ($this->T[$a][$b] === $this->T[$c][$d]) {
				$this->acquiredCards[$this->P] += 2;
			} else {
				$this->P = -~$this->P % $this->N;
			}
		}
	}
	
	[$H, $W, $N] = explode(" ", trim(fgets(STDIN)));
	$T = [];
	for ($i = 0; $i < $H; $i++) {
		$T[] = explode(" ", trim(fgets(STDIN)));
	}
	$concentration = new Concentration($N, $T);
	$L = fgets(STDIN);
	while ($L--) {
		[$a, $b, $A, $B] = array_map(fn($_) => ~-$_, explode(" ", fgets(STDIN)));
		$concentration->concentration($a, $b, $A, $B);
	}
	
	for ($i = 0; $i < $N; $i++) {
		echo $concentration->getAcquiredCards($i) . "\n";
	}
?>
