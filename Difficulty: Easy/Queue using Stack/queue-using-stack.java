class myQueue {

    // Initialize your data members
    Stack<Integer>data=new Stack<>();
    Stack<Integer>temp=new Stack<>();

    void enqueue(int x) {
        // Implement enqueue operation
        while(!data.isEmpty())
        {
            temp.push(data.pop());
        }
        
        data.push(x);
        while(!temp.isEmpty())
        {
            data.push(temp.pop());
        }
        
    }

    void dequeue() {
        // Implement dequeue operation
        data.pop();
    }

    int front() {
        // Implement front operation
        if(data.isEmpty())
        return -1;
        
        
        return data.peek();
    }

    int size() {
        // Implement size operation
        return data.size();
    }
}
