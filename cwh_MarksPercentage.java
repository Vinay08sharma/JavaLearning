import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 15-02-2021
 */
public class cwh_MarksPercentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks of Subject 1 out of 100: ");
        int a = sc.nextInt();

        System.out.println("Enter the Marks of Subject 2 out of 100: ");
        int b = sc.nextInt();

        System.out.println("Enter the Marks of Subject 3 out of 100: ");
        int c = sc.nextInt();

        System.out.println("Enter the Marks of Subject 4 out of 100: ");
        int d = sc.nextInt();

        System.out.println("Enter the Marks of Subject 5 out of 100: ");
        int e = sc.nextInt();

       /* if((a > 100 || a < 0) || (b > 100 || b < 0) || (c > 100 || c < 0) || (d > 100 || d < 0) || (e > 100 || e < 0)){
            System.out.println("Error !!! Please enter the marks less 100 or more than 0");
        }*/

        int total = a + b + c + d + e;

        System.out.println("Total Marks Obtained : "+ total);

        int res = total * 100 / 500;

        System.out.println("Percentage Obtained : "+res+"%");



        if(res>=75 && res <=100){
            System.out.println("Excellent!!");
        }
        else if(res < 75 && res > 60){
            System.out.println("Very Good");
        }

        else if(res < 60 && res > 40){
            System.out.println("Good! Work bit Hard");
        }
        else if(res < 40 && res > 1)
        {
            System.out.println("Failed !! Please study well");
        }

        else
        {
            System.out.println("You have entered wrong input");
        }




    }
}
