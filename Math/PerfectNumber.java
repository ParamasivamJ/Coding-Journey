package Math;

public class PerfectNumber {

    /*A perfect number is a positive integer that is 
    * equal to the sum of its proper divisors, 
    * excluding the number itself. */
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.println(n +" is Perfect number");
        }
        else {
            System.out.println(" Not a Perfect number");
        }
    }
}
