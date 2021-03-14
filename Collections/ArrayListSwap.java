package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class ArrayListSwap {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(24);
        arr.add(27);
        arr.add(54);
        arr.add(54);

        System.out.println("Before Swapping : "+arr);

        Collections.swap(arr,1,4);

        System.out.println("After Swapping : "+arr);


        //indexOf & lastindexOf;

        System.out.println("Index of 24 is : "+arr.indexOf(24)); // This will return the index of 24

        System.out.println("Index of 54 is : "+arr.lastIndexOf(54)); // This will return the last index of the value
       // that hasbeen pass, In case of duplicacy last occurance will be returned
    }

}
