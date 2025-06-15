package Array;

import java.util.Arrays;

public class RotateArray {

    static void right(int[ ] arr, int k){
        int n=arr.length;
        k=k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        
        System.out.println("Right rotated array: " + Arrays.toString(arr));
    }

    static void left(int[ ] arr, int k){
        int n=arr.length;
        k=k%n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }



    static void reverse(int[] arr, int st, int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
    
        right(arr, 3);
        left(arr, 2);
    }
    
}
