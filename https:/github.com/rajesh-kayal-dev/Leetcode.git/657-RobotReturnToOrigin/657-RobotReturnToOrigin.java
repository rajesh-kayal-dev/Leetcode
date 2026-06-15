// Last updated: 6/15/2026, 10:00:17 AM
class Solution {
    public boolean judgeCircle(String moves) {
      int x=0,y=0;
        //left -ve, right +ve,up -ve,dn -ve;
    for(char ch : moves.toCharArray()){
        if(ch == 'R')
        x++;
        if(ch == 'L')
        x--;
        if(ch == 'U')
        y++;
        if(ch == 'D')
        y--;
    }  
    return x==0 && y==0;
    }
}