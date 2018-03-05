package samplewebapplication;

public class Test {

	public static void main(String[] args) {
		foo(null, 0);
	}
	static ListNode<Integer> foo(ListNode<Integer> l, int k) {
		ListNode<Integer> head = l;
	    while(head!= null){
	        if(head.value == k && head.next != null){
	            ListNode<Integer> nextValue = head.next;
	            head.value = nextValue.value;;
	            head.next = nextValue.next;
	        }else{
	            head= head.next;
	        }
	        
	    }    
	    
	    return l;
	    
	}
	
	class ListNode<T> {
	   ListNode(T x) {
	     value = x;
	   }
	   T value;
	   ListNode<T> next;
	 }

}
