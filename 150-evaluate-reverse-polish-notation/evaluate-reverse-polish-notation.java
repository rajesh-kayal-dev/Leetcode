class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String token : tokens){
            //check if token is operations
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))
            {
                //pop two operand
                int b = stack.pop(); //second operand
                int a = stack.pop(); //first operand

                switch(token){
                    case "+" : stack.push(a + b); break;
                    case "-" : stack.push(a - b); break;
                    case "*" : stack.push(a * b); break;
                    case "/" : stack.push(a / b); break;
                }
            }else{
                    //token is a number
                    stack.push(Integer.parseInt(token));
                }
        }
        return stack.pop();
    }
}
