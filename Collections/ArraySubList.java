package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class ArraySubList {

    //If we need to make an array which is the sublist of the other arraylist
    //we can use sublist(), sublist(int fromindex, int toIndex)
    //Here fromindex will be included & toIndex will be excluded

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>();
        alist.add("A");
        alist.add("B");
        alist.add("C");
        alist.add("D");


        //Create new arraylist as a sublist of alist
        ArrayList<String> arr = new ArrayList<>(alist.subList(1,3));
        System.out.println("Original arraylist "+alist);
        System.out.println("Sublist "+arr);

    }
}
