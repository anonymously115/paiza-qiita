<?php

    class WordChain {
        private $n;
        private $d;
        private $alive;
        private $bef;
        private $p;

        public function __construct($n, &$d) {
            $this->n = $n;
            $this->d = &$d;
            $this->alive = array_fill(0, $n, true);
            $this->bef = "";
            $this->p = 0;
        }

        public function wordChain($s) {
            if (isset($this->d[$s]) && ($this->bef === "" || $s[0] === $this->bef[~-strlen($this->bef)]) && $s[~-strlen($s)] !== 'z') {
                unset($this->d[$s]);
                $this->bef = $s;
            } else {
                $this->alive[$this->p] = false;
                $this->bef = "";
            }
            do {
                $this->p = -~$this->p % $this->n;
            } while (!$this->alive[$this->p]);
        }

        public function aliveCount() {
            return array_sum($this->alive);
        }

        public function isAlive($i) {
            return $this->alive[$i];
        }
    }

    fscanf(STDIN, "%d %d %d", $n, $k, $m);
    $d = [];
    while ($k--) {
        $d[trim(fgets(STDIN))] = true;
    }

    $wordChain = new WordChain($n, $d);
    while ($m--) {
        $wordChain->wordChain(trim(fgets(STDIN)));
    }

    echo $wordChain->aliveCount() . PHP_EOL;
    for ($i = 0; $i < $n; $i++) {
        if ($wordChain->isAlive($i)) {
            echo ($i + 1) . PHP_EOL;
        }
    }
        
?>
