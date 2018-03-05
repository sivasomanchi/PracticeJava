package practise.java.sort;

public class InsertionSort implements Sort {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int [] sorted = is.sort(new int[] {7,3,1,8,5,4,2});
		System.out.println("After Sorting:::");
		is.printArray(sorted);

	}
	
	@Override
	public int[] sort(int[] unsorted) {
		System.out.println("Before Sorting:::");
		printArray(unsorted);
		for(int i=1;i<unsorted.length;i++) {
			int value = unsorted[i];
			int hole = i;
			while(hole>0 && unsorted[hole-1]>value) {
				unsorted[hole] = unsorted[hole-1];
				hole = hole-1;
			}
			unsorted[hole] = value;
		}
		return unsorted;
	}

	@Override
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
		
	}

}
