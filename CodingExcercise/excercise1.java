package CodingExcercise;

/**
 * @author Vinaykumar.Sharma on 14-03-2021
 */
public class excercise1 {

    public static void main(String[] args) {

        String s = "shotl";
        String s1 = "java";

        System.out.println(sub(s).concat(sub(s1)));

    }

    public static String sub(String str){
        return str.substring(1);
    }
}
