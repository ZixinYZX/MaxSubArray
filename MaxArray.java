package zixinyang;

public class MaxArray {
	
	public static void main(String[] args){
		int arr[] = {-2,11,-4,13,-5,-5,-2};
		int result = maxSubArray(arr);
	    System.out.println("最大子段和为："+result);
	}
	
	public static int maxSubArray(int[] arr){
		int sum = 0;
		int maxsum = 0;
		
		for(int i = 0; i < arr.length; i ++){
			if(sum <= 0){
				sum = arr[i];
			}else{
				sum += arr[i];
			}
			
			if(sum > maxsum){
				maxsum = sum;
			}
		}
		return maxsum;
	}
	
}
