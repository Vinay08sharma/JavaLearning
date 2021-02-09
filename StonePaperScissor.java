import java.util.Random;
import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 09-02-2021
 */
public class StonePaperScissor {

    static int num;
    public static int isInRange(int num2){
        Scanner sc = new Scanner(System.in);
        if(num2 < 0 || num2 >2){
            System.out.println("Invalid Input Please enter the value between 0 to 2 only");
            num2 = sc.nextInt();
            num = isInRange(num2); // add "num = " at the beginning of the line
        }
        return num;
        }


    public static void main(String[] args) {
        int t = 0;
        int comp = 0;
        int person = 0;


            System.out.println("===============================================");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for Stone");
            System.out.println("Enter 1 for Paper");
            System.out.println("Enter 2 for Scissor");

        while (t<3) {
            System.out.print("Enter the number between 0 - 2 : ");
            num = sc.nextInt();
            isInRange(num);


            Random rand = new Random();

            int num1 = rand.nextInt(3);

            if (num1 == 0) {
                System.out.println("Computer has selected Stone");

            } else if (num1 == 1) {
                System.out.println("Computer has selected Paper");
            } else {
                System.out.println("Computer has selected Scissor");
            }

            if (num == num1) {
                System.out.println("Its a Tie!!");
            } else if (num == 0) {
                if (num1 == 1) {
                    System.out.println("Paper wraps the stone, Computer won the game!!");
                    comp++;
                } else {
                    System.out.println("Stone crushes the scissor, You Won!!");
                    person++;
                }
            } else if (num == 1) {
                if (num1 == 0) {
                    System.out.println("Paper wraps the stone, You Won!!");
                    person++;
                } else {
                    System.out.println("Scissor cuts the paper, Computer Won!!");
                    comp++;
                }

            } else if (num == 2) {
                if (num1 == 0) {
                    System.out.println("Stone crushes the scissor,Computer Won!!");
                    comp++;
                } else {
                    System.out.println("Scissor cuts the paper, You Won!!");
                    person++;
                }
            }
            t++;
        }

        System.out.println("Computer won "+ comp + " matches & You won "+person + " Matches");
            if(comp > person){
                System.out.println("Computer won the tournament");
            }
            else if(person > comp){
                System.out.println("HURRAY!!! You won the tournament");
            }
            else
            {
                System.out.println("There is a tie!!! Please Try Again!!");
            }

        }


}
