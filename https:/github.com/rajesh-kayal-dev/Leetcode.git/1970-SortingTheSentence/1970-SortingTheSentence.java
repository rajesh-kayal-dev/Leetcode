// Last updated: 6/15/2026, 9:59:10 AM
class Solution {
    public String sortSentence(String s) {
        String [] str =s.split(" ");
        String [] arr = new String[str.length];

        for(String t:str){
            int n =t.length();
            int pos = t.charAt(n-1)-'0';
            arr[pos-1]=t.substring(0,n-1);
        }

        StringBuilder sb = new StringBuilder();

        for(String t:arr){
            sb.append(t);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}