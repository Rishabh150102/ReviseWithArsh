public class LinkedList3 {

    public int getDecimalValue(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        cnt--;
        int ans = 0;
        while(cnt >= 0){
            if(head.val == 1){
                ans += (int)Math.pow(2, cnt);
            }
            head = head.next;
            cnt--;
        }
        return ans;
    }
    public static void main(String[] args) {
        //1290. Convert Binary Number in a Linked List to Integer

    }
}
