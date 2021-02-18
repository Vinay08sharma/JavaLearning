/**
 * @author Vinaykumar.Sharma on 19-02-2021
 */
public class moolya {

    //O/p = 1 2 3 4 hi 6 7 8 9 hi .........1000

    public static void main(String[] args) {

        int flag = 0;

        for(int i = 1 ; i < 100;i++){
            System.out.print(i + " ");
            flag++;

            if(flag==4){
                System.out.print("hi"+" ");
                flag =0;
            }
        }
    }
}
