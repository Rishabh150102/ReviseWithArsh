public class LinkedList4 {
    public ListNode deleteDuplicates(ListNode head) {
        //if nodes are 0
        if(head == null || head.next == null){
            return head;
        }
        //if contains 2 nodes with same value
        if((head.next.next == null) && (head.val == head.next.val)){
            head.next = null;
            return head;
        }

        ListNode slow = head, fast = head.next;
        while(fast != null){
            if(slow.val == fast.val){
                fast = fast.next;
                slow.next = fast;
                
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        //83. Remove Duplicates from Sorted List

    }
}
