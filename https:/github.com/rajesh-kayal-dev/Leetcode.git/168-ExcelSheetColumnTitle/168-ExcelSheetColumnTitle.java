// Last updated: 6/15/2026, 10:01:42 AM
class Solution {
    public String convertToTitle(int col) {
       StringBuilder sb = new StringBuilder();
        
         while(col > 0){
            int r = (col - 1)% 26;
            sb.append((char)(r+'A'));
            col=(col - 1)/ 26;
        }
        return sb.reverse().toString(); 
    }
}