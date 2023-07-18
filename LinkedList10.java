class LinkedList10 {
	Node head; // head of the list

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void push(int new_data)
	{
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		head = new_Node;
	}
	public void printList()
	{
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	public void deleteNode(Node Node_ptr)
	{
		Node temp = Node_ptr.next;
		Node_ptr.data = temp.data;
		Node_ptr.next = temp.next;
		temp = null;
	}

	public static void main(String[] args)
	{
		LinkedList10 llist = new LinkedList10();

		/* Use push() to construct below list
		1->12->1->4->1 */
		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);

		System.out.println("Before deleting");
		llist.printList();

		llist.deleteNode(llist.head.next);

		System.out.println("\nAfter Deleting");
		llist.printList();
	}
}

