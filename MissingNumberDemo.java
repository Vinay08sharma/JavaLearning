
public class MissingNumberDemo {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,8};
		
		int expected_result = a.length+1;
		int total_sum = expected_result*(expected_result+1)/2;
		int sum = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("Missing Number is::"+(total_sum-sum));
	
	
	
	}
}
	