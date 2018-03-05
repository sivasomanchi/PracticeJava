package samplewebapplication;

public class Hammingdistance {

	public static void main(String[] args) {
//		System.out.println(hammingDistance(31,90));
		System.out.println(arrayPairSum(new int[] {1,4,3,2}));

	}
	
	public static int hammingDistance(int x, int y) {
        int ans = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                ans++;
            }
            x = x / 2;
            y = y / 2;
        }
        
        return ans;
    }
	
    public static int arrayPairSum(int[] nums) {
        System.out.println("Defore Sorting:::" +  printArray(nums));
        bubbleSort(nums);
        System.out.println("After Sorting:::"+ printArray(nums));
        int sum = 0;
        
        for(int i=1;i<nums.length;i=i+2){
            sum += Math.min(nums[i-1] , nums[i]);
            System.out.println("Min function output:::"+Math.min(nums[i-1] , nums[i]));
        }
        return sum;
    }
    
    private static String printArray(int[] nums) {
		for(int i =0;i<nums.length;i++) {
			System.out.print(" " + nums[i]);
		}
		return "Done";
	}

	public static void bubbleSort(int[] nums) {
    	
		for (int i = 0; i < nums.length; i++) {
			boolean flag = false;
			for (int j = 0; j <=nums.length - 2; j++) {
				if (nums[j] > nums[j+1]) {
					swap(nums, j, j+1);
					flag = true;
				}
				
			}
			if(!flag) break;
		}
    }
    
    public static void swap(int[] nums, int first, int second) {
    		int secondValue = nums[second];
    		nums[second] = nums[first];
    		nums[first] = secondValue;
    }
    
    public static void testing(String word) {
    	int idx = word.charAt(0) - 97 >= 0 ? word.charAt(0) - 97 : word.charAt(0) - 65;
    }
    
    static int matrixElementsSum(int[][] matrix) {
        
        int sum =0;
        loop:
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                if(matrix[j][i] == 0) continue loop;
            }
        }
        return sum;
        
    }


}
