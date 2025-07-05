class Solution {
    private static final String[] KEYPAD={
        "",//0
        "",//1
        "abc",//2
        "def",//3
        "ghi",//4
        "jkl",//5
        "mno",//6
        "pqrs",//7
        "tuv",//8
        "wxyz",//9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        //base case
        if( digits == null || digits.length() == 0){
            return result;
        }
        // StingBuilder combination = new StringBuilder();
        //backtrack
        backtrack(0,digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder combination, List<String> result)
    {
        if(index == digits.length()){
            result.add(combination.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for(char ch : letters.toCharArray()){
            combination.append(ch);

            backtrack(index + 1, digits, combination, result);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}