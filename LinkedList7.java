public class LinkedList7 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode l1 = list1, l2 = list2;
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        ListNode h = ans;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        //remaining element
        while(l1!=null){
            head.next = l1;
            l1 = l1.next;
            head = head.next;
        }
        while(l2!=null){
            head.next = l2;
            l2 = l2.next;
            head = head.next;
        }
        return h.next;
    }
    public static void main(String[] args) {
        //21. Merge Two Sorted Lists

    }
}
