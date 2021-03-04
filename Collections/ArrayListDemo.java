package Collections;

import java.util.ArrayList;
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

        for(int i = 0; i<ar.size();i++){
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

        }

    }
}
