/**
 * @author Vinaykumar.Sharma on 23-02-2021
 */
public class AlphabetCount {

    public static void main(String[] args) {

        // O/p = A1 B2 C3 D4....Z26

        int count = 1;
        //StringBuilder sb = new StringBuilder();
        String s = "";
        for(char i = 'A'; i <= 'Z'; i++){
            s+=" "+i+count;
            count++;
        }
        System.out.println(s.trim());


    }
}
