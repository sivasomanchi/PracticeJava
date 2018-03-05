package algo.practice.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public StackUsingQueue() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
		
	}
	
	public void push(int value) {
		if(queue1.isEmpty()) {
			queue1.add(value);
			System.out.println("Pushed value ::::"+ value);
		}
		else {
			int size = queue1.size();
			for (int i = 0; i <size; i++) {
				queue2.add(queue1.remove());
			}
			queue1.add(value);
			System.out.println("Pushed value in non empty queue::::"+ value);
			for (int i = 0; i < size; i++) {
				queue1.add(queue2.remove());
			}
		}
	}
	
	public int pop() {
		if (!queue1.isEmpty()) {
			int returnValue = queue1.remove();
			System.out.println("Poped Value :: "+returnValue);
			return returnValue;
		}
		System.out.println("Stack is empty!!!");
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		StackUsingQueue sq = new StackUsingQueue();
		sq.pop();
		sq.push(10);
		sq.push(11);
		sq.push(12);
		sq.pop();
		sq.push(13);
		sq.push(14);
		sq.push(15);
		sq.push(16);
		sq.push(17);
		sq.pop();sq.pop();sq.pop();
		sq.pop();
	}

}
