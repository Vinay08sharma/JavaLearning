/**
 * @author Vinaykumar.Sharma on 09-03-2021
 */
public class AddStringInBetween {

    public static void main(String[] args) {

        String s1 = "HELL";
        String s2 = "WOOHOO";

        String hStr = s1.substring(0,2);
        System.out.println(hStr);
        String rStr = s1.substring(2,4);
        System.out.println(rStr);
        System.out.println(hStr+s2+rStr);
    }
}
