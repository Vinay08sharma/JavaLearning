package CodingExcercise;

import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String str = sc.next();
        System.out.println("Enter the Character : ");
        String c = sc.next();

        int initialLength = str.length();

       String newString =  str.replace(c,"");

       int newlength = newString.length();

        System.out.println("Occurance of the character "+c+" is : "+(initialLength-newlength));
    }
}
