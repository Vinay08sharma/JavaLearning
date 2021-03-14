package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Vinaykumar.Sharma on 24-02-2021
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<>();

        ar.add("Vinay");
        ar.add("Sharma");
        ar.add("SDET");
        ar.add("QA Automation Engineer");

        //To print the above Arraylist

        //Using for loop

       /* for(int i = 0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("===============Using Foreach Loop=================");

        //Using foreach loop
        for(String s : ar){
            System.out.println(s);
        }

        System.out.println("===============Using Stream with Lambda Function=================");

        ar.stream().forEach(ele -> System.out.println(ele));

        System.out.println("===============Using Iterator =================");

        Iterator<String> it = ar.iterator();

        while (it.hasNext()){
           String nxt =  it.next();
            System.out.println(nxt);

        }*/

        //Update the values in  arraylist

        ar.set(3,"Appium developer");

        //How to get the size of the array

        System.out.println(ar.size());

        //How to get data from particular index
        System.out.println("String at index 2 : "+ar.get(2));

        //This will add all the list data from ar to ar2
        ArrayList<String> ar2 = new ArrayList<>(ar.size());
        ar2.addAll(ar);
        System.out.println("New Array list data : "+ar2);

        //How to remove all the elements from the array
       // ar.removeAll(ar);

        //Another way to remove all the elements from the array clear();

        ar.clear(); // better in time complexity

        //print size after removing all the details
        System.out.println("size after removing all the elements "+ar.size());

        //New Array list for integer

        ArrayList<Integer> qty = new ArrayList<>();
        qty.add(4);
        qty.add(3);
        qty.add(6);
        qty.add(1);

        //Sort the array

        Collections.sort(qty);

        System.out.println("Sorted array : "+qty);

        //Reverse order sorting
        Collections.sort(qty,Collections.reverseOrder());
        System.out.println("Reverse Order : "+qty);

    }
}
