package String;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    static void method(String s){
        Map<Character,Integer> freq= new HashMap<>();
         for(char c:s.toLowerCase().toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
         }
         for(char c: freq.keySet()){
            System.out.println(c+" appears "+ freq.get(c)+" times");
         }
    }
    public static void main(String[] args) {
        method("AAAbbbsccsBaC");
        
    }
    
}
