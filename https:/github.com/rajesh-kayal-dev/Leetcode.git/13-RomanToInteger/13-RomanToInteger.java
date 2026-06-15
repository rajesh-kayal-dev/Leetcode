// Last updated: 6/15/2026, 10:03:35 AM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // 1. Initialize and populate the map with Roman numeral values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        int n = s.length();
        
        // 2. Iterate through the string
        for (int i = 0; i < n; i++) {
            int currentVal = map.get(s.charAt(i));
            
            // 3. Subtraction Rule: If current value < next value, subtract current from result
            // Example: IV -> 5 - 1 = 4
            if (i < n - 1 && currentVal < map.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                // Otherwise, add the value
                result += currentVal;
            }
        }
        
        return result;
    }
}
