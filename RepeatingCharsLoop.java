/**
 * @author Vinaykumar.Sharma on 11-03-2021
 */
public class RepeatingCharsLoop {

    public static void main(String[] args) {

        String s = "madam";
        int count;
        for(int i = 0; i <s.length();i++){
           count  = 1;
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
           if(count>1){
               System.out.println(s.charAt(i)+" ");
               System.out.println(count);
           }
        }
    }
}
