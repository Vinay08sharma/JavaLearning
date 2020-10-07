
public class Largest2numbers {

	
	public static void main(String[] args) {
		
		int[] a = {1,4,22,55,66,88};
		
		int temp =0;
		
		for(int i =0; i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
				
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			

		}
		System.out.println("Second largest number is :: "+a[1]);
		
		
		
	}
}
