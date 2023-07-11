/**
 * LinkedList11
 */
public class LinkedList11 {

    public boolean isPalindrome(ListNode head) {
        //extreme cases
        if(head.next == null){
            return true;
        }
        if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            }
            else{
                return false;
            }
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse from middle
        ListNode prev = null, curr = slow, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //check if palindrome
        ListNode temp1 = head, temp2 = prev;
        while(temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}