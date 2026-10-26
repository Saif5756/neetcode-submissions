class MyQueue {
    int size=100;
        int[] queue=new int[size];
        int front=-1;
        int rear=-1;
        
       

    public void push(int x) {
        if(front==-1) front=0;
        queue[++rear]=x;
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int removed = queue[front++];
        return removed;
    }
    
    public int peek() {
        if(empty()){
            return -1;
        }
        return queue[front];
    }
    
    public boolean empty() {
        return front==-1 || front >rear; 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */