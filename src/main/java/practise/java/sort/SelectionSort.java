package practise.java.sort;

public class SelectionSort implements Sort{

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] sorted = ss.sort(new int[] {7,3,1,8,5,4,2});
		System.out.println("After sorting::::");
		ss.printArray(sorted);
	}
	
	
	public int[] sort(int [] unsorted) {
		System.out.println("Before sorting::::");
		printArray(unsorted);
		for(int i=0;i<unsorted.length-1;i++) {
			int min = i;
			for(int j = i+1;j<unsorted.length;j++) {
				if(unsorted[j]<unsorted[min]) min = j;
			}
			swap(unsorted, i, min);
			System.out.println("While sorting::::");
			printArray(unsorted);
		}
		return unsorted;
	}
	
	public void printArray(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(" "+unsorted[i]);
		}
		System.out.println();
	}

	void swap(int[] unsorted, int first, int second) {
		int temp = unsorted[second];
		unsorted[second] = unsorted[first];
		unsorted[first] = temp;
	}
}
