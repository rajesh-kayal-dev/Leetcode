// Last updated: 6/15/2026, 10:00:03 AM
class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function fib($n) {
        if($n == 0 ) return 0;
        if($n == 1 ) return 1;
        $a = 0;
        $b = 1;

        for($i = 2; $i<= $n;$i++){
            $c = $a + $b;
            $a = $b;
            $b = $c;
        }
        return $b;
        
    }
}