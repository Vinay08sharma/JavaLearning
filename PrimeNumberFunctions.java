
public class PrimeNumberFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckPrimeNumber(15);
		
		if(isPrime==true)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("not a prime");
		}
		
		
	}		
		static boolean isPrime= true;
		public static boolean CheckPrimeNumber(int num)
		{
			for(int i=2;i<num/2; i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	

}
