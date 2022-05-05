import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int pop = 0;
    public void push(int x) {
       q1.add(x);
    }
    
    public int pop() {
        
        
        while(q1.size() != 1){
           q2.add(q1.peek());
            q1.remove();
        }
        pop = q1.peek();
        q1.remove();
        for (Integer item: q2) {
            q1.add(item);
        }
        return pop;
    
    }
    
    public int top() {
        int top = 0;
        for(Integer element : q1){
           top = element;
        }
        return top;
    }
    
    public boolean empty() {
        
        if(q1.peek() == null){
            return true;
        }else if(pop == q1.peek()){
            return true;
            
        }else{
            return q1.isEmpty();
        }
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