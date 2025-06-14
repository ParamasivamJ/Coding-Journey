package Math;

public class Gcd {
    static void method(int a, int b){
        while(b!=0){
            int n=a%b;
            a=b;
            b=n;
        }
        System.out.println("GCD: "+a);
    }
    public static void main(String[] args) {
        method(36,60);
    }
}
