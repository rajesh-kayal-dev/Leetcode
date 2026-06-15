// Last updated: 6/15/2026, 10:03:23 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result,"",0,0,n);
        return result;
    }
    public void generate(List<String> result, String current,int open,int close,int max){
        //Base case: if current is complete add into result
        if(current.length() == max * 2){ //n=3 ((())) 3* 2 -> 6 cahars
        result.add(current);
        }

        if(open < max){
            generate(result,current + "(", open + 1, close,max);
        }

        if(close < open){
            generate(result, current + ")", open , close + 1,max);
        }
    }
}
