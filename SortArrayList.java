import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vinaykumar.Sharma on 18-02-2021
 */
public class SortArrayList {
//[2,5,1,10,20,20,15]
    public static void main(String[] args) {

       /* ArrayList<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(5);
        i.add(1);
        i.add(10);
        i.add(20);
        i.add(20);
        i.add(15);



        Collections.sort(i,Collections.reverseOrder());

        for(int a : i){
            System.out.print(a+" ");
        }*/

        int[] i = {2,5,1,10,20,20,15};


        int temp = 0;
        for(int j = 0; j<i.length;j++)
        {
            for(int k = j+1;k<i.length;k++){
                if(i[j]<i[k]){
                    temp = i[j];
                    i[j] = i[k];
                    i[k] = temp;
                }
            }
        }
        for(int l : i){
            System.out.print(l+" ");
        }
    }
}
