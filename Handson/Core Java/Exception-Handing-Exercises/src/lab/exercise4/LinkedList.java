package lab.exercise4;


public class LinkedList implements Cloneable {
        @Override
		public Object clone() throws CloneNotSupportedException {
    		return super.clone();
	}
	Node head; 
	static class Node {

		int num;
		Node next;
		Node(int d)
		{
			num= d;
			next = null;
		}
	}

	
	public static LinkedList insert(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		}
		else {
			
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.num + " ");
			currNode = currNode.next;
			
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		LinkedList list1 = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		System.out.println("list1");
		printList(list);
		try
        {
            list1 = (LinkedList) list.clone();
            System.out.println("list2");
            printList(list1);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
	}
}
