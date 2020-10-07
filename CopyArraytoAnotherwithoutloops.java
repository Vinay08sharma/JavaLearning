import java.util.Arrays;

public class CopyArraytoAnotherwithoutloops {

	
	public static void main(String[] args) {
		
		String[] a = {"Vinay","Sharma","pooja","sharma"};
		
		String[] b = Arrays.copyOf(a, a.length);
		
		System.out.println("Old Array : "+Arrays.toString(a));
		System.out.println("New Array : "+Arrays.toString(b));
	}
}
