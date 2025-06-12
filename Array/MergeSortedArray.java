package Array;
public class MergeSortedArray {
    public static void method(int arr1[],int m,int arr2[],int n){
        m--;
        n--;
        int i=m+n+1;
        while(m>=0 && n>=0){
            if(arr1[m]>arr2[n]){
                arr1[i--]=arr1[m--];
            }
            else {
                arr1[i--]=arr2[n--];
            }
        }

        while(n>=0){
            arr1[i--]=arr2[n--];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        method(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");

        }
    }
}