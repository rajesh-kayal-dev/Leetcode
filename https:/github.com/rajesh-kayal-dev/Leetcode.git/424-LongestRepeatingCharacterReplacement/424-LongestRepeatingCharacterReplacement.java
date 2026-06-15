// Last updated: 6/15/2026, 10:00:28 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // A-Z letters frequency
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int result = 0;

        for(right = 0; right < s.length(); right++){
            //current index
            int idx = s.charAt(right) - 'A';
            freq[idx]++;

            //update MaxFrq
            maxFreq = Math.max(maxFreq,freq[idx]);

            while((right - left + 1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            //reqsult update
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}