package algo.practice.tree;

import algo.practice.tree.BinaryTree.Node;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		Node<Integer> root = new Node<Integer>(50);
		Node<Integer> leftOfRoot = new Node<Integer>(80);
		Node<Integer> rightOfRoot = new Node<Integer>(40);
		
		root.setLeftNode(leftOfRoot);
		root.setRightNode(rightOfRoot);
		
		
		Node<Integer> leftOfLeftRoot = new Node<Integer>(20);
		Node<Integer> rightOfLeftRoot = new Node<Integer>(30);
		Node<Integer> leftOfRightRoot = new Node<Integer>(90);
		Node<Integer> rightOfRightRoot = new Node<Integer>(10);
		
		leftOfRoot.setLeftNode(leftOfLeftRoot);
		leftOfRoot.setRightNode(rightOfLeftRoot);
		rightOfRoot.setLeftNode(leftOfRightRoot);
		rightOfRoot.setRightNode(rightOfRightRoot);
		
		
		Node<Integer> leftOfLeftLeftRoot = new Node<Integer>(15);
		Node<Integer> rightOfLeftLeftRoot = new Node<Integer>(25);
		Node<Integer> leftOfRightLeftRoot = new Node<Integer>(35);
		Node<Integer> rightOfRightLeftRoot = new Node<Integer>(45);
		
		
		leftOfLeftRoot.setLeftNode(leftOfLeftLeftRoot);
		leftOfLeftRoot.setRightNode(rightOfLeftLeftRoot);
		rightOfLeftRoot.setLeftNode(leftOfRightLeftRoot);
		rightOfLeftRoot.setRightNode(rightOfRightLeftRoot);
		
		binaryTree.head = root;
		System.out.println("Pre Order Data");
		binaryTree.preOrder(binaryTree.head);
		System.out.println("==========================");
		System.out.println("Post Order Data");
		binaryTree.postOrder(binaryTree.head);
		System.out.println("==========================");
		System.out.println("In Order Data");
		binaryTree.inOrder(binaryTree.head);
	}

}
