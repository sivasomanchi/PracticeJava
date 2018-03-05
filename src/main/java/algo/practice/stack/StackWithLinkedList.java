package algo.practice.stack;

public class StackWithLinkedList {

	public Node head;
	
	public class Node{
		int value;
		Node next;
	}
	
	public StackWithLinkedList(){
		head = null;
	}
	
	public void push(int n) {
		if(head != null) {
			Node pushNode = new Node();
			pushNode.value = n;
			Node nextValue = head;
			head=pushNode;
			head.next = nextValue;
			System.out.println("Pushed value ::"+head.value);
		}else {
			Node firstValue = new Node();
			firstValue.value = n;
			head = firstValue;
			System.out.println("Pushed value ::"+head.value);
		}
	}
	
	public int pop() {
		if(head != null) {
			Node nextValue = head;
			head = head.next;
			System.out.println("Poped value ::" + nextValue.value);
			return nextValue.value;
		}else {
			System.out.println("Stack is empty!!!");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		StackWithLinkedList list = new StackWithLinkedList();
		list.pop();
		list.push(10);
		list.push(20);
		list.pop();
		list.push(30);
		list.push(40);
		list.push(50);
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
	}

}
