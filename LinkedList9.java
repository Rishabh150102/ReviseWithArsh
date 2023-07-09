public class LinkedList9 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null){
            ListNode temp = headB;
            while(temp != null){
                if(temp == headA){
                    return headA;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return headA;
    }
    public static void main(String[] args) {
        //160. Intersection of Two Linked Lists

    }
}
