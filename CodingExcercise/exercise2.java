package CodingExcercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise2 {


   /* Two inputs i.e. (string, boolean value).
   Ask user to input string and check If boolean value set to TRUE, return a string length 1 from its beginning,
    if its set to FALSE, return a string length 1 from its end.
    Note : The string will be non-empty.
    Ex1:("Hello", true) → "H"
    Ex2:("Hello", false) → "o"
    Ex3:("oh", true) → "o*/


        public static void demoProgram() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string : ");
                String str = sc.next();
                System.out.println("Choose between True or False");
                boolean flag = sc.nextBoolean();

                if (flag) {
                    System.out.println(str.charAt(0));
                } else {
                    System.out.println(str.charAt(str.length() - 1));
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter boolean value either true or false");
                demoProgram();
            }
        }

        public static void main(String[] args) {
            demoProgram();
        }
}
