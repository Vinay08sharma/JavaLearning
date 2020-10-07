import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomNumberBetween {

	
	public static void main(String[] args) {
		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		 int newrandom = 0 ;
		
		System.out.println("Enter the random number between 1 to 9 : ");
		int num = sc.nextInt();
		
		if(num<1 || num>9)
		{
			System.out.println("Please ente the number between 1 to 9 only");
		}
		
		else
		{
			newrandom = r.nextInt(9);
		
		
		System.out.println("Random number is "+newrandom);
		
		if(num < newrandom)
		{
			System.out.println("Low");
		}
		else if(num == newrandom)
		{
			System.out.println("HURRAYYYY!!! You guessed it right");
		}
		else if(num > newrandom)
		{
			System.out.println("High");
		}
		}
	}
}
