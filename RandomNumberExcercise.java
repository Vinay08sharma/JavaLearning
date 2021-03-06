import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 09-03-2021
 */
public class RandomNumberExcercise {

    static int enteredNumber;


    public static void UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number between 1 - 9 Only : ");
        enteredNumber = sc.nextInt();

        if (enteredNumber < 1 || enteredNumber > 9) {
            System.out.println("Error.. Please put Number between 1 - 9 Only");
            UserInput();
        }
    }


    public static void main(String[] args) {
        try {
            UserInput();

            Random rand = new Random();

            int random = rand.nextInt(9);

            System.out.println("Random Number generated by the Computer is : " + random);

            if (enteredNumber < random) {
                System.out.println("Low");
            } else if (enteredNumber == random) {
                System.out.println("HURRAYYY!! You Guessed it Correct! You are Genius");
            } else {
                System.out.println("High");
            }


        } catch (InputMismatchException e) {
            System.out.println("Error.. Exiting... Please enter only numbers");
        }
    }
}
