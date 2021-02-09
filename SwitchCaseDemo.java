import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 05-12-2020
 */
public class SwitchCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Grade between A - D only : ");
       char ch =  sc.next().toUpperCase().charAt(0);


       switch (ch){

           case 'A':
               System.out.println("Excelent");
               break;

           case 'B':
               System.out.println("Amazing");
               break;

           case 'C':
               System.out.println("Well done");
               break;

           case 'D':
               System.out.println("You can do better next time");
               break;

           default:
               System.out.println("Invalid Grade entered");
       }

    }


}


