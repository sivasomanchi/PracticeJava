package practise.java.sort;

public class BubbleSort implements Sort{

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int [] sorted = bs.sort(new int[] {7,3,1,8,5,4,2});
		System.out.println("After Sorting::::");
		bs.printArray(sorted);
	}
	
	
	public int [] sort(int [] unsorted) {
		System.out.println("Before sorting::::" );
		printArray(unsorted);
		for(int i=0;i<unsorted.length;i++) {
			boolean swap = false;
			for (int j = 0; j < unsorted.length-i-1; j++) {
				if(unsorted[j]>unsorted[j+1]) {
					unsorted = swap(unsorted, j, j+1);
					swap = true;
				}
			}
			System.out.println("While Sorting::::");
			printArray(unsorted);
			if (!swap) {
				break;
			}
		}
		
		return unsorted;
	}


	private int[] swap(int[] unsorted, int first, int second) {
		int temp = unsorted[first];
		unsorted[first] = unsorted[second];
		unsorted[second] = temp;
		
		return unsorted;
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+ array[i]);
		}
		System.out.println();
	}

}
