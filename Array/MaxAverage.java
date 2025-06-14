package Array;

public class MaxAverage {
    static double method(int[] arr,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];            
        }
        int max=sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            max=Math.max(max, sum);
        }
        return (double)max/k;
    }
    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Maximum Average Subarray : "+method(nums, k));  
    }
    
}
