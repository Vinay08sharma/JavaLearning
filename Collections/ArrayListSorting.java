package Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class ArrayListSorting {

    /*  By default sort is done in ascending order using sort();
        To sort array is reverse we need to use Collections class Collections.reverseOrder();
    */


    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("B");
        arr.add("A");
        arr.add("D");
        arr.add("C");

        System.out.println("Default : "+arr);
        Collections.sort(arr);
        System.out.println("After Sorting : "+ arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("Reverse or descending order : "+arr);

        //Sorting for numbers

        System.out.println("ARRAYLIST IN INTEGERS");
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(2);
        alist.add(6);
        alist.add(3);
        alist.add(1);

        System.out.println("Default : "+alist);

        Collections.sort(alist);

        System.out.println("After sorting : "+alist);

        Collections.sort(alist,Collections.reverseOrder());

        System.out.println("Reverse or Descending order : "+alist);



    }
}
