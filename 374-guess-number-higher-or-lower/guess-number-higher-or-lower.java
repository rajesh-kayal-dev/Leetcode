/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;

        while(low <= high){
            int mid= low + (high - low)/2;
            int result = guess(mid);
            
            if(result == 0){
                return mid; // Found the correct number
            }else if(result < 0){
                high = mid - 1; // Guess was too high
            }else{
                low = mid + 1; // Guess was too low
            }
        }
        return -1; // Just in case, though problem guarantees it exists
    }
}