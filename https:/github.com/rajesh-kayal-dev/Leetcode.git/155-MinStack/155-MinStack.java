// Last updated: 6/15/2026, 10:01:43 AM
import java.util.Stack;
class MinStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> min =new Stack<>();
    
    public MinStack() {
              
    }
    
    public void push(int val) {
        if(s1.empty() || min.peek()>=val){
            min.push(val);
        }
        s1.push(val);
    }
    
    public void pop() {
        int x=s1.pop();
        if(x==min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */