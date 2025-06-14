package Math;
public class FibonacciSeries {

    public static void main(String[] args) {
        int n=10;
        int first=0,second=1;
        int next;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
            next=first+second;
            first=second;
            second=next;
            System.out.print(next+" ");
        }
    }
}