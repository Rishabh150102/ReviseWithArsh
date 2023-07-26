import java.util.Deque;
import java.util.LinkedList;

/**
 * StacksQueues4
 */
public class StacksQueues4 {

    static class Stack{

        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{

        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int get(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek " + q.get());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek" + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}