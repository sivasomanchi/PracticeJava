package algo.practice.tree;

public class BinaryTree<T> {

	Node<T> head;

	public static class Node<T> {
		T value;

		Node<T> leftNode;

		Node<T> rightNode;

		Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getLeftNode() {
			return leftNode;
		}

		public void setLeftNode(Node<T> leftNode) {
			this.leftNode = leftNode;
		}

		public Node<T> getRightNode() {
			return rightNode;
		}

		public void setRightNode(Node<T> rightNode) {
			this.rightNode = rightNode;
		}
	}

	public void preOrder(Node<T> root) {
		if (root != null) {
			System.out.println("Data for node:" + root.getValue());
			preOrder(root.getLeftNode());
			preOrder(root.getRightNode());
		}
	}
	
	public void postOrder(Node<T> root) {
		if(root !=null) {
			postOrder(root.getLeftNode());
			postOrder(root.getRightNode());
			System.out.println("Data for node:" + root.getValue());
		}
	}
	
	public void inOrder(Node<T> root) {
		if(root != null) {
			inOrder(root.getLeftNode());
			System.out.println("Data for Node" +root.getValue());
			inOrder(root.getRightNode());
		}
	}
}
