package CodingExcercise;

import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise5 {
/*
    Ask user to input a string of odd length, return the string length 3 from its middle. The string length will be at least 3.
    Ex1:("Candy") → "and"
    Ex2:("and") → "and"
    Ex3:("solving") → "lvi"
    Ex4:("Happy") → "app"
   */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string greater that 3 chars : ");
        String s = sc.next();
        
        if(s.length()<3){
            System.out.println("Please enter string greater that 3 chars ");
        }
        else if(s.length()%2==0){
            System.out.println("Please choose a the string of Odd Length");
        }
        else if (s.length()==3){
            System.out.println(s);
        }
        else
        {
            int l = s.length()-3;
            int g = l/2;

            for(int i = g;i<s.length()-g;i++){
                System.out.print(s.charAt(i));
            }
        }
    }
}
