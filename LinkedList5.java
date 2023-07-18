
class LinkedList5
{
	Node head; 
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	void sortList()
	{
	int count[] = {0, 0, 0};
		
	Node ptr = head;
		
	while (ptr != null)
	{
			count[ptr.data]++;
			ptr = ptr.next;
	}

	int i = 0;
	ptr = head;

		while (ptr != null)
		{
			if (count[i] == 0)
				i++;
			else
			{
			ptr.data= i;
			--count[i];
			ptr = ptr.next;
			}
		}
	}					
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
		System.out.print(temp.data+" ");
		temp = temp.next;
		}
		System.out.println();
	}

    //function for sorting by changing links
    // public static Node sortList(Node head)
    // {
    //     if(head==null || head.next==null)
    //     {
    //         return head;
    //     }
        
    //     Node zeroD = new Node(0); 
    //     Node oneD = new Node(0); 
    //     Node twoD = new Node(0); 
  
         
    //     Node zero = zeroD, one = oneD, two = twoD; 
    //     // Traverse list 
    //     Node curr = head; 
    //     while (curr!=null) 
    //     { 
    //         if (curr.data == 0) 
    //         { 
    //             zero.next = curr; 
    //             zero = zero.next; 
    //             curr = curr.next; 
    //         }
    //         else if (curr.data == 1) 
    //         { 
    //             one.next = curr; 
    //             one = one.next; 
    //             curr = curr.next; 
    //         } 
    //         else 
    //         { 
    //             two.next = curr; 
    //             two = two.next; 
    //             curr = curr.next; 
    //         } 
    //     }
    //     // Attach three lists 
    //     zero.next = (oneD.next!=null) ? (oneD.next) : (twoD.next); 
    //     one.next = twoD.next; 
    //     two.next = null;
    //     // Updated head 
    //     head = zeroD.next;
    //     return head;
    // }
	public static void main(String args[])
	{
		LinkedList5 llist = new LinkedList5();
		
		llist.push(0);
		llist.push(1);
		llist.push(0);
		llist.push(2);
		llist.push(1);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		llist.push(2);
		
		System.out.println("Linked List before sorting");
		llist.printList();
		
		llist.sortList();

		System.out.println("Linked List after sorting");
		llist.printList();
	}
}
