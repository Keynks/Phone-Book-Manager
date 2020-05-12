package phoneBook;

/*
	PLEASE ADD ONTO THIS TO DO LIST AS YOU WORK ON THE PROJECT SO WE CANN SEE WHAT WE HAVE GOING
	The linked list used in this is a doubly dummy head linked list and its circular
	A doubly list is a linked list that on each Node it has a reference  to the previous and next node in the list
	** To Do List 88
	* clean up alot of code and space it out nice//done
	* NODE MANIPULATORS//done
	* CLEAN UP THE MENU BECAUSE IM NOT LIKING THE LAY OUT TOO MUCH PRETTY BLAND
	* SEPERATE CLASS THAT WILL CREATE OBJECTS THAT HOLD PHONE, NUMBER,
	*included a sort for the contacts

 */

//This class is made up of LINKED LIST MANIPULATORS ONLY.

public class contacts {

	private class Node{//basic linked list setup
		private Object data;
		private Node next, prev;

		private Node(Object data, Node prev, Node next){
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

	private Node head;
	public int size = 0;

	public contacts(){
		this.head = new Node(null, null, null);
		this.head.prev = this.head;
		this.head.next = this.head;
		this.size = 0;
	}

	public void addLast(Object data){
		if(isEmpty())
			addFirst(data);
		else{
			Node newNode = new Node(data, this.head.prev, this.head.next);
			this.head.prev = newNode;
			this.head.prev.next = newNode;
			size++;
		}
	}

	public boolean remove( Object data){// this method will search the array for the object and return a boolean...

		Node cur = this.head.next;//starting point

		while (cur != this.head){// since we are using dummy head node this.head is our stop point.

			if(this.head.data.equals(data)){
				cur.prev.next = cur.next;// all this is how you delete a doubly linked list Node its all just relinking the next and prev references.
				cur.next.prev = cur.prev;
				size--;//reduce size to show change.
				return true;
			}
			cur = cur.next; // this will increment cur by one node at a time.
		}
		return false;
	}

	public void addFirst(Object data){
		Node newNode = new Node(data, this.head, this.head.next);
		this.head.next.prev = newNode;
		this.head.next = newNode;
		size++;
	}

	public boolean isEmpty(){//boolean method that checks the list;
		return this.size == 0;
	}

	public void sort(){//insertion sort method
		if(this.size == 0)
			return;;

		Node lastSorted, sortedWalker;
		Comparable firstUnsortedData;

		for(lastSorted = this.head.next; lastSorted != this.head.prev; lastSorted = lastSorted.next){
			firstUnsortedData = (Comparable) lastSorted.next.data;

			for(sortedWalker = lastSorted; sortedWalker !=head&&
					((Comparable)sortedWalker.data).compareTo(firstUnsortedData) > 0; sortedWalker = sortedWalker.prev ){

				sortedWalker.next.data = sortedWalker.data;
			}
			sortedWalker.next.data = firstUnsortedData;
		}

	}

	@Override
	public String toString(){
		String result = "{";

		for (Node node = this.head.next; node != this.head; node = node.next) {
			if(node.next != this.head)
				result += node.data + "->";
			else
				result += node.data;
		}
		return result + "}";
	}





}
