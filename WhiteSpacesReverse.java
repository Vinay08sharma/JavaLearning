
public class WhiteSpacesReverse {
	
	public static void main(String[] args) {
		
		
		//11. A String is given to remove the white spaces, reverse it and print the only odd position characters.

		
		String s= "i want to become an SDET";
		
		String s1 = s.replaceAll(" ", "");
		System.out.println(s1);
		
	//============ REVERSE IT ===========
		
		String rev = "";
		
		for(int i = s1.length()-1;i>0;i--)
		{
			rev = rev + s1.charAt(i);
			
		}
		System.out.println(rev);
		
		//============= ODD Positions =========
		
		String rep = "";
		
		for(int j = 1; j<rev.length();j = j+2)
		{
			rep = rep + rev.charAt(j);
		}
		
		System.out.println("Odd Postion elements:: "+rep);
		
		//================== First char Caps On =================
		
		String s6 = "i am vinay";

		//String s1 = new String("Vinay");

		String[] s7 = s6.split("\\s");
		String captial = "";

		for(String s8 : s7)
		{
			String s9 = s8.substring(0, 1).toUpperCase();
			String s10 = s8.substring(1);
			captial = captial+s9+s10+" ";
			
			
		}
		System.out.println(captial);
	}

}
