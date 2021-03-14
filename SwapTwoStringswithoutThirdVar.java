/**
 * @author Vinaykumar.Sharma on 24-02-2021
 */
public class SwapTwoStringswithoutThirdVar {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        //1.
        a = a + b;//HelloWorld

        System.out.println(a);

        //2.

        b = a.substring(0,a.length()-b.length());

        //3.

       a = a.substring(b.length());

        System.out.println("After swapping");
        System.out.println(a);

        System.out.println(b);


    }
}
