// Last updated: 6/15/2026, 9:59:04 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int product = 1;

        while(n > 0){
           int digit = n % 10;
            sum += digit; //18
            product *= digit; //81
            n /= 10; 
        }
        int total = sum + product; //99

        return total != 0 && original % total == 0;
    }
}