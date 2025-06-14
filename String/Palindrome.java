package String;

public class Palindrome {

    static void method(String s){
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println("Not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Is a Palindrome");
    }
    public static void main(String[] args) {
        method("MADAM");
    }
    
}
