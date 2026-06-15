// Last updated: 6/15/2026, 10:00:00 AM
class Solution {

    /**
     * @param Integer[] $arr
     * @return Integer
     */
    function peakIndexInMountainArray($arr) {
        $start = 0;
        $end = count($arr) - 1; // Corrected to use count($arr)
        
        while ($start <= $end) {
            $mid = $start + floor(($end - $start) / 2);
            
            if ($arr[$mid] > $arr[$mid - 1] && $arr[$mid] > $arr[$mid + 1]) {
                return $mid;
            } elseif ($arr[$mid] > $arr[$mid - 1]) {
                $start = $mid + 1;
            } else {
                $end = $mid - 1;
            }
        }
        
        return $mid; // Return the peak index
    }
}
