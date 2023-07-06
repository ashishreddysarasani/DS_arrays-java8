package Java8_CloudTech;

public class MyLinkedList {

	Node head;
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static MyLinkedList insert(MyLinkedList list,int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		//printlist();
		if(list.head==null) {
			list.head= newNode;
			
		}else {
			Node last = list.head;
			
			while(last.next != null) {
				last= last.next;
			}
			last.next= newNode;
		}
		return list;
	}

	public static void printlist(MyLinkedList listNode) {
		// TODO Auto-generated method stub
		Node curr = listNode.head;
		System.out.println("printing linkedlist: ");
		
		while(curr!= null) {
			System.out.println(curr.data);
			
			curr = curr.next;
		}
	}

	
}
