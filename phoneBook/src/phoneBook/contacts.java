package phoneBook;

public class contacts {

	public class Node {
		int num;
		Node next;

		public Node(int num) {
			this.num = num;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void add(int num) {
		Node phoneNum = new Node(num);
		if (head == null) {
			// If list is empty, both head and tail would point to new node.
			head = phoneNum;
			tail = phoneNum;
			phoneNum.next = head;
		} else {
			// tail will point to new node.
			tail.next = phoneNum;
			// New node will become new tail.
			tail = phoneNum;
			// Since, it is circular linked list tail will point to head.
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				// Prints each node by incrementing pointer.
				System.out.print(" " + current.num);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

}
