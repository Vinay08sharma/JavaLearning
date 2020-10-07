
public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		
	
	try {
		
		int a = 10/0;
		
	}
	
	catch (ArithmeticException e1) {
		
		System.out.println("Arithmetic exception");
	
	}
	catch (Exception e) {
		System.out.println("error occured");
	}
	
	

}
}
