
public class RemoveCharFromString {

	
	public static void charRemo(String str , int index)
	{
		
		
//		if(index < 0 || index > str.length())
//		{
//			System.out.println("ERROR!!!!!");
//		}
//		
//		String rem = "";
//		for(int i =0; i<str.length()-1;i++)
//		{
//			if(i<index)
//			{
//				rem = rem + str.charAt(i);
//			}
//			
//			else
//			{
//				rem = rem + str.charAt(i+1);
//			}
//		}
//		
//		System.out.println(rem);
//		
		//System.out.println(replaced);
		
		if(index < 0 || index > str.length())
		{
			System.out.println("ERROR!!!");
		}
		
		String rem = "";
		
		for(int i =0;i<str.length()-1;i++)
		{
			if(i<index)
			{
				rem = rem + str.charAt(i);
			}
			else
				rem = rem + str.charAt(i+1);
		}
		
		System.out.println(rem);
		
		
	}
	
	
	public static void main(String[] args) {
		
		charRemo("tester", 1);
		
	}
}
