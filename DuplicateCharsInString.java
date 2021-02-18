import java.util.HashMap;
import java.util.Map;

/**
 * @author Vinaykumar.Sharma on 19-02-2021
 */
public class DuplicateCharsInString {

    public static void main(String[] args) {

        String s = "Welcome to moolya";

     //  String[] str= s.split(" ");
        char[] c = s.toCharArray();

        HashMap<Character,Integer> hs = new HashMap<>();

        for(char ch : c){
            if(hs.containsKey(ch)){
                hs.put(ch,hs.get(ch)+1);
            }
            else
                hs.put(ch,1);
        }

        for(Map.Entry<Character,Integer> entry : hs.entrySet()){
            if(entry.getValue()>1){
                System.out.println("The Repeated character is : "+entry.getKey()+" "+entry.getValue());
            }
        }

    }

}
