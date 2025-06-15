package Array;

public class MaxProductSubarray {
    /*
     * Given an integer array nums, 
     * find a subarray that has the largest product, and return the product.
     */
    
     static int method(int[] arr){
        int currmin=arr[0];
        int currmax=arr[0];
        int max=arr[0];

        /*
            When we see a negative number, multiplying it can flip the sign.
            So the current max can become the min, and the min can become the max.
            That's why we swap them before continuing — to make sure we don't miss a bigger product.
        */


        for (int i = 1; i< arr.length; i++) {
            if(arr[i]<0){
                int temp=currmax;
                currmax=currmin;
                currmin=currmax;
            }
            currmax=Math.max(arr[i],currmax*arr[i]);
            currmin=Math.min(arr[i],currmin*arr[i]);

            max=Math.max(max, currmax);
        }
        return max;            
     }
     public static void main(String[] args) {
        //int[] arr={-2,0,-1};
        int[] arr={2,3,-2,4};
        System.out.println("Maximum Subarray Product: "+method(arr));
     }
}
