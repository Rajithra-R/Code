class MyStack {

    Queue<Integer> q; 
    
    public MyStack() {
        q = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        int size = q.size();
        q.add(x);  // add the ele at the front but i want to add it at the end since it is a stack
        for(int i=0;i<size;i++)
        {
            int a = q.remove();
            q.add(a);
        }
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        return q.remove();
    }
    
    public int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
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