
public class NaturalNumberRecursive {

	
	public static int addNum(int num)
	{
		if(num!=0)
		{
			return num + addNum(num-1);
		}
		
		else
		{
			return num;
				
		}
		
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		
		int Sum = addNum(num);
		
		System.out.println("Sum of the natural numbers are:: "+Sum);
		
		System.out.println("factorial::"+ fact(0));
		
	}
	
	
	public static int fact(int num1)
	{
		if(num1 >=1)
		{
			return num1 * fact(num1-1);
		}
		else
		{
			return 1;
		}
		
	}

	
}

