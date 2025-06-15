package Array;

public class RangeSum {
    int[] prefix;
    RangeSum(int[] arr){
        prefix=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
    }

    int getSum(int left,int right){
        return prefix[right+1]-prefix[left];
    }
    
    public static void main(String[] args) {
        int[] arr= {-2, 0, 3, -5, 2, -1};
        RangeSum sum= new RangeSum(arr);

        System.out.println("Sum:"+sum.getSum(0,2 ));
        System.out.println("Sum:"+sum.getSum(2,5 ));
        System.out.println("Sum:"+sum.getSum(0,5 ));
    }
}
