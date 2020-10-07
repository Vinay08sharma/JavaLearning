
public class RerverseNumber {

	public static void main(String[] args) {


		int num = 232;
		
		int rev = 0;
		
		int num2 = num;
		
		while(num2!=0)
		{
			int n  = num2 % 10;
			rev = rev * 10 + n;
			num2 = num2/10;
			
		}
		System.out.println(rev);
		
		if(num == rev)
		{
			System.out.println("The number is a Palindrome");
		}
		
		else
		{
			System.out.println("The number is not a palindrome");
		}
		
		
		
		/*=========== Another Method ========= */
		int num1 = 3432;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		String s = "Vinay";
		
		char c = 'a';
		
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)== c)
			{
				System.out.println("Alphabet is present");
			}
		}
	}

}
