package String;

import java.util.Arrays;

public class Anagram {
    /*
     Two strings are called anagrams if they contain 
     the same characters in the same frequencies, 
     but possibly in different orders.
    */
    static void method(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println(" Not a Anagram");
        }

        int[] s1arr=s1.chars().sorted().toArray();
        int[] s2arr=s2.chars().sorted().toArray();

        if(Arrays.equals(s1arr,s2arr)){
            System.out.println("Is a Anagram");
        }
        else{
            System.out.println(" Not a Anagram");
        }

    }
    public static void main(String[] args) {
        method("ABc","cbA");
        
    }
}
