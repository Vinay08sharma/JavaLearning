package CodingExcercise;

import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class exercise7 {

/*

    Ask user to input a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.
    Ex1: ("Hello") → "HeHeHe"
    Ex2:("ab") → "ababab"
    Ex3:("H") → "HHH"

*/

    public static void main(String[] args) {

        String s = "ab";
        int copy = 3;
        if(s.length()<2){
            for(int i =0; i<copy;i++){
                System.out.print(s);
            }
        }
        else{
            for(int i = 0; i<copy;i++){
                System.out.print(Character.toString(s.charAt(0))+Character.toString(s.charAt(1)));
            }
        }

    }
}
