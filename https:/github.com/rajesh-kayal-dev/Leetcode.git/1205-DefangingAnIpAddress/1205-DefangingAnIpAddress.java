// Last updated: 6/15/2026, 9:59:33 AM
class Solution {
    public String defangIPaddr(String address) {
        //Aproch :1
       /* int n = address.length();
        String s="";
        for(int i =0;i<n;i++){
            char ch = address.charAt(i);
            if (ch != '.')
                s=s+ch;
            else
                s=s+"[.]";
        }
        return s;
        */
        //Approch :2

        StringBuilder sb = new StringBuilder();
        int n =address.length();
        for(int i =0;i<n;i++){
            char ch = address.charAt(i);
            if(ch != '.')
                sb.append(ch);
            else
                sb.append("[.]");

        }
        return sb.toString();
    }
}