import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Vinaykumar.Sharma on 18-02-2021
 */
public class FirstRepeatingChar {

    public static void main(String[] args) {

        String s = "Hey Hello Hi";

        char[] c = s.toCharArray();

        //Using linkedHashMap as it will maintain the insertion order
        Map<Character,Integer> hs= new LinkedHashMap<>();

        for(char ch : c){
            if(hs.containsKey(ch)){
                hs.put(ch, hs.get(ch)+1);
            }
            else {
                hs.put(ch,1);
            }
        }

            for(Map.Entry<Character,Integer> entry : hs.entrySet()) {
                if(entry.getValue()==1){
                    System.out.println(entry.getKey());
                    break;
                }
            }
    }
}
