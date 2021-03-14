package CodingExcercise;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise4 {

    /*Given a string, count the number of words ending in 'y' or 'z' --
    string "heavy" → Output 1 : As it has 1 y at end, so output should be 1.
    string "Yellow"→ Output 0 : As it has 1 y but its not at the end, its at the beginning, so output should be 0.
    string "fez"→ Output 1 : As it has 1 z at end, so output should be 1.
    string "fez day"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
    string "day fez"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
    string "day fyyyz"→ Output 2 : As it has 1 z and 1 y at the end, so output should be 2.
    string "sunday"→ Output 1 : As it has 1 y at the end, so output should be 1.
    string "zero"→ Output 0 : As it has 1 z but its not at the end, its at the beginning, so output should be 0
*/
    public static void main(String[] args) {

        String s = "zero";
        //  char c = 'y';
        String[] str = s.split(" ");
        int count = 0;
        int n = str.length;
        for (int i = 0; i < n; i++) {
            String s1 = str[i];
            if (s1.charAt(s1.length() - 1) == 'y' || s1.charAt(s1.length() - 1) == 'z') {
                count++;
            }
        }
        System.out.println(count);


    }
}
