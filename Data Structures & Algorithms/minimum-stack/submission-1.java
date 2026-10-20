class MinStack {
        Stack<Integer> stk;
        Stack<Integer> stkMin;
    public MinStack() {
       stk=new Stack<Integer>();
        stkMin=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(stkMin.isEmpty() || val<=stkMin.peek()){
            stkMin.push(val);
        }
        stk.push(val);
    }
    
    public void pop() {
        if (stkMin.peek().equals(stk.peek())) {
            stkMin.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return stkMin.peek();
    }
}
