
/**
 * LinkedList8
 */
public class LinkedList8 {

    // Linked list node
    static class Node
    {
        int data;
        Node next;
          
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //function to multiply
    public static long multiply(Node first, Node sec){
        long num1 = 0, num2 = 0;
        while(first != null){
            num1 += first.data;
            num1 *= 10;
            first = first.next;
        }

        while(sec != null){
            num2 += sec.data;
            num2 *= 10;
            sec = sec.next;
        }

        return ((num1/10)*(num2/10));
    }

    public static void main(String[] args) {
        // create first list 9->4->6
        Node first = new Node(9);
        first.next = new Node(4);
        first.next.next = new Node(6);
        // System.out.print("First List is: ");
        // printList(first);
  
        // create second list 8->4
        Node second = new Node(8);
        second.next = new Node(4);
        System.out.println(multiply(first, second));
    }
}