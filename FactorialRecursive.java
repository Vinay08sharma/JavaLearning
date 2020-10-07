import java.util.Scanner;

public class FactorialRecursive {

	
	
	// Without recurssive function
	public int factoriall(int num)
	{
		int fact = 1;
		
		if(num == 0)
		{
			return 1;
		}
		
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		
		return fact;
	}
	
	
	// with recursive function-- function is calling itself
	
	public static int factt(int num)
	
	{
		if(num == 0)
		{
			return 1;
		}
		
		else
			return (num * factt(num-1));
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter the number:: ");
		int n = sc.nextInt();
		
		FactorialRecursive f = new FactorialRecursive();
		System.out.println("Factorial of the number is :: "+f.factoriall(n));
		
		System.out.println(factt(3));
	}

}
