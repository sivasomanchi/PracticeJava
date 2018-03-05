package algo.practice.stack;

public class StackWithArrayCustom {
	int[] arr;
	int size;
	int top;
	
	public StackWithArrayCustom(int size) {
		this.arr = new int[size];
		this.size = size;
		top = -1;
	}
	
	public void push(int value) {
		if(!isFull()) {
			top++;
			arr[top] = value;
		}else {
			System.out.println("Stack is full!!!");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int topValue = top;
			top--;
			return arr[topValue];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public Boolean isFull() {
		return size -1 == top;
	}
	
	public Boolean isEmpty() {
		return top ==-1;
	}
	
	public int peek() {
		return arr[top];
	}

	public static void main(String[] args) {
		
		StackWithArrayCustom stack = new StackWithArrayCustom(8);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println("=====");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
