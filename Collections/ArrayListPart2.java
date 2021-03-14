package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class ArrayListPart2 {

    public static void main(String[] args) {

        //ArrayList to Array
        ArrayList<String> alist = new ArrayList<>();
        alist.add("A");
        alist.add("B");
        alist.add("C");
        alist.add("D");
        alist.add("E");

        System.out.println("Arraylist is : " + alist);

        String[] arr = new String[alist.size()];

        alist.toArray(arr);

        System.out.println("Array is :");
        for (String a : arr) {
            System.out.print(a);
        }
        System.out.println();

        //How to get the length of the array
        System.out.println("Array Length is : " + arr.length);


        //Array to ArrayList
        String[] s = {"A", "B", "C"};

        //Print the array
        for(String str:s){
            System.out.println(str);
        }

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(s));

        System.out.println("ArrayList is : "+arr1);

        //ArrayList to String

        String s1 = arr1.toString();
        System.out.println("String Version : "+s1);

        //If we print the size of the string in the above case it will return 9 as it will count
        // space,commas and characters as well


    }
}


