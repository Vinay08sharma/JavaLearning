import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class PullZero {

    public static void main(String[] args) {

        int[] arr = {2,3,0,0,5,0,8};

        int temp = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
                temp = arr[arr.length-1];
                arr[arr.length-1] = arr[i];
                arr[i] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));




    }
}
