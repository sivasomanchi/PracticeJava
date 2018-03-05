package algo.practice.stack;

public class StackSorting {
	
	int[] arr;
	int size;
	int top;
	
	StackSorting(int size){
		arr = new int[size];
		this.size = size;
		this.top =-1;
	}
	
	public void push(int i) {
		if(!isFull()) {
			top++;
			arr[top] = i;
			System.out.println("Pushed value:::" +i);
		}else {
			System.out.println("Stack is full!!!");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnValue = arr[top];
			top--;
			System.out.println("Poped Value :::"+ returnValue);
			return returnValue;
		}
		else {
			System.out.println("Stack is Empty!!!");
			return -1;
		}
	}
	
	public int peek() {
		return arr[top];
	}
	
	public Boolean isEmpty() {
		return top==-1;
	}
	
	public Boolean isFull() {
		return size-1 == top;
	}
	
	public static void main(String[] args) {
		StackSorting stack = new StackSorting(15);
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(33);
		stack.push(4);
		stack.push(55);
		stack.push(6);
		stack.push(7);
		stack.push(88);
		stack.push(9);
		stack.printStack(stack);
		System.out.println("=====");
		stack.printStack(stack.sortStack(stack));
	}
	
	public StackSorting sortStack(StackSorting stack) {
		StackSorting tempStack = new StackSorting(stack.size);
		while(!stack.isEmpty()){
			int maxValue = stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek()>maxValue) {
				stack.push(tempStack.pop());
			}
			tempStack.push(maxValue);
		}
		return tempStack;
	}

	public void printStack(StackSorting stack) {
			System.out.println("Elements of stacks are:");
			for (int i = 0; i <= stack.top; i++) {
				System.out.println(stack.arr[i]);
			}
	}
}
