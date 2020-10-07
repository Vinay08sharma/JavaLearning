import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {


		int n = 370;
		int rem = 0;
		int sum = 0;
		int a = n;

		while(a!=0)
		{
			rem = a % 10;
			sum = sum + (rem * rem * rem);
			a= a/10;

		}

		if(sum == n)
		{
			System.out.println("It is an ArmStrong Number");
		}
		
		else
		{
			System.out.println("It is not an ArmStrong Number");
		}
		
//		
//		int num1, num2;
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("Enter the first number ::");
//	      num1 = sc.nextInt();
//	      System.out.println("Enter the second number ::");
//	      num2 = sc.nextInt();
//
//	      for (int i = num1; i<num2; i++){
//	         int check, rem, sum = 0;
//	         check = i;
//	         while(check != 0) {
//	            rem = check % 10;
//	            sum = sum + (rem * rem * rem);
//	            check = check / 10;
//	         }
//	         if(sum == i){
//	            System.out.println(""+i+" is an Armstrong number.");
//	         }
//	      }
//			
		}
	}

