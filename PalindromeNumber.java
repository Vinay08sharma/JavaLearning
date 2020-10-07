
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 112211;
		
		int rev = 0;
		
		int num1 = num;
		
		while(num1!=0)
		{
			int n  = num1%10;
			rev = rev * 10 + n;
			num1 = num1/10;
			
		}
		
		System.out.println("Reverse of the number is :: "+rev);
		
		if(rev == num)
		{
			System.out.println("Number is palindrome");
		}
		
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
