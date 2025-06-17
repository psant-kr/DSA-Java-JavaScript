package frquencyCounter.FrequencyCharacterString;
import java.util.*;

 public class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String given_str = "Prashant Kumar p";
        String str = given_str.toLowerCase();
        
        HashMap<String, Integer> hs = new HashMap<>();
        
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            
            if(c != ' '){
                String ch = Character.toString(c);
                if(hs.containsKey(ch)){
                    int currentValue = hs.get(ch);
                    hs.put(ch, currentValue + 1);
                    
                }else{
                    
                    hs.put(ch, 1);
                   
                }
                 
            }
             
        }
        System.out.println(hs);
        for (String keys : hs.keySet()){
            System.out.println(keys + " : " + hs.get(keys));
        }
    }
}