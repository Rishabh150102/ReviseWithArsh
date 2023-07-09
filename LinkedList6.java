public class LinkedList6 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        //classical solution.
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        //206. Reverse Linked List

    }
}
