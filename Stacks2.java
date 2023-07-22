import java.util.LinkedList;
import java.util.Queue;

/**
 * Stacks2
 */
public class Stacks2 {

    class MyStack {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            q1.add(x);

            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
    }
    
    public int pop() {
        // if(isEmpty()){
        //         System.out.println("Queue Empty");
        //         return -1;
        //     }

            return q1.remove();
    }
    
    public int top() {
        // if(isEmpty()){
        //         System.out.println("Queue Empty");
        //         return -1;
        //     }

            return q1.peek();
    }
    
    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}

    public static void main(String[] args) {
        //225. Implement Stack using Queues

    }
}