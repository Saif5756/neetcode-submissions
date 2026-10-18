class MyStack {
     int top=-1;
     int[] item =new int[100];

    public void push(int x) {
                   
        top++;
        item[top]=x;
    }
    
    public int pop() {

            return item[top--];
     
    }
    
    public int top() {
        return item[top];
    }
    
    public boolean empty() {
        return top<0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */