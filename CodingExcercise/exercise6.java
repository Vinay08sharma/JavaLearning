package CodingExcercise;

import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise6 {
/*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b.
    If either string is length 0, use '@' for its missing char.
    Ex1:("last", "chars") → "ls"
    Ex2:("yo", "java") → "ya"
    Ex3:("hi", "") → "h@"
   */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String first = sc.next();

        System.out.print("Enter the Second String : ");
        String sec = sc.next();

        if(first.length()==0 || first.equals("")){
            first="@";
        }
        else if(sec.length()==0 || sec.equals("")){
            sec="@";
        }
        else{
            char a = first.charAt(0);
            char b = sec.charAt(sec.length()-1);
            System.out.println(Character.toString(a)+Character.toString(b));
        }
        sc.close();
    }
}
