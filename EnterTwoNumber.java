import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 09-03-2021
 */
public class EnterTwoNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();

        if(a == 6 || b == 6){
            System.out.println("True Value is 6");
        }
        else if(a + b == 6 || a - b == 6){
            System.out.println("True Addtion or Substraction is 6");
        }
        else {
            System.out.println("ERRR!!!! Nothing Matched!!!");
        }

    }
}
