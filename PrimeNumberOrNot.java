
public class PrimeNumberOrNot {

	
	public static void main(String[] args) {
		
		int num = 2;
		
		
		boolean flag = false;
		
		for(int i =2; i<=num-1;i++)
		{
		if(num%i==0)
		{
			flag = true;
		}
		}
		if(flag == false)
		{
			System.out.println("prime number");
		}
	
		else
			System.out.println("not a prime number");
	}
}
