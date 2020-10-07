
public class SwapTwoNumbers {

	
	public static void main(String[] args) {
		
		
		//5. Swap two number s without using the third variable.

		int a = 10, b = 20;
		
		a = a+b;
		b = a - b;
		a = a - b;
		
		System.out.println(a +" "+ b);
	}
}
