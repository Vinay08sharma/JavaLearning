
public class Practice {
	
	public static void main(String[] args) {
		
		
		String s = "this is vinay vinay";
		
		String[] s1 = s.split(" ");
		
		for(int i =0;i <=s1.length;i++)
		{
			for(int j = i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					System.out.println("Duplicate found :: "+s1[i]);
					break;
				}
			}
		}
		
	
		
	}

}
