/**
 * @author Vinaykumar.Sharma on 12-03-2021
 */
public class RemoveString {
    public static void main(String[] args) {

        String s = "codexxcodexxcodecode";

        System.out.println(s.split("code",-1).length-1);
    }
}
