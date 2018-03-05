package algo.practice.linkedlist;

public class LinkedListCustom<T> {

	Node<T> head = null;

	public static class Node<T> {
		T value;

		Node<T> next;

		Node(T value) {
			this.value = value;
		}

		Node() {

		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	public void insertLast(Node<T> node) {
		if (head == null) {
			head = node;
		} else {
			Node<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
	}

	public void printList() {
		if (head == null)
			System.out.println("List is empty!!!");
		Node<T> printValue = head;
		while (printValue != null) {
			System.out.println("::" + printValue.getValue());
			printValue = printValue.getNext();
		}
	}

	public void deleteFirst() {
		if (head != null) {
			if (head.getNext() != null)
				head = head.getNext();
		} else {
			System.out.println("List is Empty");
		}
	}

	public void deleteAfter(T node) {
		if (head != null) {
			Node<T> current = head;
			while (current.getNext() != null) {
				if (current.getValue() == node) {
					Node<T> afterDeleteNode = current.getNext().getNext();
					current.setNext(afterDeleteNode);
					break;
				}
				current = current.getNext();
			}
		}
	}

	public void insertFirst(Node<T> node) {
		if (head != null) {
			Node<T> nextHead = head;
			head = node;
			head.setNext(nextHead);
		} else {
			head = node;
		}
	}

	public Node<T> reverseList(Node<T> headNode) {
		Node<T> current = headNode;
		Node<T> previous = null;
		Node<T> next = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

	public Node<T> middleElement() {
		if (head != null) {
			Node<T> current = head;
			int size = 1;
			while (current.getNext() != null) {
				current = current.getNext();
				size++;
			}
			Node<T> currentTraverse = head;
			int middleValue = size / 2;
			int start = 0;
			while (start < middleValue) {
				currentTraverse = currentTraverse.getNext();
				start++;
			}
			return currentTraverse;
		}
		System.out.println("Empty list");
		return null;
	}

	public Boolean ifLoopExists() {
		Node<T> fastNode = head;
		Node<T> slowNode = head;
		while (fastNode != null && fastNode.getNext() != null) {
			fastNode = fastNode.getNext().getNext();
			slowNode = slowNode.getNext();
			if (fastNode == slowNode) {
				return true;
			}
		}
		return false;
	}

	public Boolean checkIfPalindrome() {
		if (head != null) {
			Node<T> firstNode = head;
			Node<T> middleOfTheList = middleElement();
			Node<T> reversedList = reverseList(middleOfTheList);
			while (firstNode.getNext() != null && reversedList.getNext() != null) {
				if (firstNode.getValue() != reversedList.getValue()) {
					return false;
				}
				firstNode = firstNode.getNext();
				reversedList = reversedList.getNext();
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		LinkedListCustom<Integer> list = new LinkedListCustom<Integer>();
		list.insertLast(new Node<Integer>(2));
		list.insertLast(new Node<Integer>(3));
		list.insertLast(new Node<Integer>(4));
		list.insertLast(new Node<Integer>(3));
		list.insertLast(new Node<Integer>(2));
		list.insertLast(new Node<Integer>(1));
		System.out.println(list.checkIfPalindrome());
	}

}
