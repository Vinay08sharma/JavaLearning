import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vinaykumar.Sharma on 04-12-2020
 */
public class ParentChil {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Arrays.fill(arr,5);

        for(int a : arr){
            System.out.println(a);
        }

        System.out.println();

        int[] b = new int[5];

        for(int i =0; i<b.length;i++)
            b[i] = i + 1;

        for(int a : b)
        {
            System.out.println(a);
        }


        int c[] = new int[5];

        System.out.println("Enter the first 5 numbers: ");
        Scanner sc  = new Scanner(System.in);

        for(int i = 0 ; i < c.length;i++){
            c[i]=sc.nextInt();
        }

        for (int f : c){
            System.out.println(f);
        }



    }




}
