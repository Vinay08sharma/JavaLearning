package Collections;

import java.util.ArrayList;

/**
 * @author Vinaykumar.Sharma on 13-03-2021
 */
public class ArrayClone {

    //This will clone original list to another list
    //Once the list is cloned, Any changes made to the original list will not be reflected in the clone list
    //Hence it is also called as Shallow copy

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        System.out.println("Original List : "+al);
        ArrayList<String> alclone = (ArrayList<String>)al.clone();

        System.out.println("Cloned list : "+alclone);

        al.add("E");
        System.out.println("Updated Original List : "+al);

        System.out.println("After updation cloned list : "+alclone); //This won't be updated

    }
}
