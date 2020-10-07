import java.util.Scanner;

public class PutsecondStringinMiddleofFirst {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 charcter string : ");
		String no1 = sc.next();
		
		System.out.println("Enter the 2nd String : ");
		String no2 = sc.next();
		
		System.out.println("The New String is : "+no1.substring(0,2)+no2+no1.substring(2,4));
	}

}
