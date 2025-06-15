package Array;

public class MinSubArrayLen {
    /*
     * Given an array of positive integers nums and a positive integer target, 
     * return the minimal length of a subarray whose sum is greater than or equal to target. 
     * If there is no such subarray, return 0 instead.
     */
    static int method(int[] arr, int target){
        int sum=0,left=0,minLen=Integer.MAX_VALUE;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;

    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Minimum Length: "+method(nums, target));
    }
    
}
