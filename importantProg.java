import java.util.Arrays;
import java.util.Collections;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class importantProg {


    public static void main(String[] args) {

        int[] a = {4, 6, 11, 8, 12, 2, 18, 0, 21, 7};
    int x = 1;
        //Output: {4, 6, 2, 8, 12, 7, 18, 0, 21, 11}
        int[] b = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length-1 ; i++) {
                if(isPrime(a[i])){
                    b[count] = a[i];
                    count++;
                    System.out.println(a[i]);
                    //a[i] = 10;
                    Collections.swap(Arrays.asList(a),a[i],a[a.length-x]);
                    x++;
                }


        }
        System.out.println(b);

    }
        public static boolean isPrime(int n){

        boolean flag = false;

        for(int l = 2; l<n/2;l++){
            if(!(n%l==0)){
                flag = true;
            }
        }
        return flag;
    }
}
