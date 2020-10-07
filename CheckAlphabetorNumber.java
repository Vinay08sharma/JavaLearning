import java.util.Scanner;

public class CheckAlphabetorNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first character : ");
		char c = sc.next().charAt(0);
		
		if(c>=65 && c<=90 || c>=97 && c<=122)
		{
			System.out.println("Entered data is Alphabet");
		}
		
		else if(c>=48 && c<=57)
		{
			System.out.println("Entered data is Number");
		}
		
		else
		{
			System.out.println("Entered data is special characters");
		}
	}

}
