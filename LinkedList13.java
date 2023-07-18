import java.util.Stack;

/**
 * LinkedList13
 */
public class LinkedList13 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> fir = new Stack<>();
        Stack<Integer> sec = new Stack<>();    
        ListNode temp1 = l1, temp2 = l2;
        //first linked list
        while(l1 != null){
            fir.push(l1.val);
            l1 = l1.next;
        }
        //second linked list
        while(l2 != null){
            sec.push(l2.val);
            l2 = l2.next;
        }

        int totalSum = 0, carry = 0;
        ListNode ans = new ListNode();
        while (!fir.empty() || !sec.empty()) {
            if (!fir.empty()) totalSum += fir.pop();
            if (!sec.empty()) totalSum += sec.pop();
            
            ans.val = totalSum % 10;
            carry = totalSum / 10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            totalSum = carry;
        }

        return carry == 0 ? ans.next: ans;
    }

    public static void main(String[] args) {
        //445. Add Two Numbers II

    }
}