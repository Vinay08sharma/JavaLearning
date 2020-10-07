
public class PowerInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		//3^4 = 81
		
		int num = 3;
		
		int pow = 4;
		int pow1 = pow;
		int res = 1;
		
		while(pow1!=0)
		{
			res = res*num;
			pow1--;
		}
		
		System.out.println(num+" power "+pow+" = "+res);
		
		/*============ Another Way ================== */
		
		System.out.println(Math.pow(num, pow));
	}

}
