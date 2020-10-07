
public class PrimeBetweenNumbers {

	public static void main(String[] args) {


//		int first = 1;
//		int last = 10;

//		int temp = 0;
//		for(int i = first; i<=last;i++)
//		{
//
//			for(int j = 2; j<=last/2;j++)
//			{
//				if(i%j==0)
//				{
//					temp = temp + 1;
//				}
//			}
//			if(temp == 0)
//			{
//				System.out.println(i);
//			}
//
//			else
//			{
//				temp = 0;
//			}
//		}
		
		
		/*==========practice ============== */
		
		int f = 1;
		int l = 100;
		
		int temp = 0;
		
		for(int i =f ; i<=l;i++)
		{
			for(int  j = 2; j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp = temp + 1;
				}
				
			}
			if(temp ==0)
			{
				System.out.print(i + " ");
			}
			else
			{
				temp = 0;
			}
			
		}
		
		
	}

}
