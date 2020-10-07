import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the first Number : ");
		double firstNumber = sc.nextDouble();
		
		System.out.print("Enter the Second Number : ");
		double secondNumber = sc.nextDouble();
		
		
		System.out.println("Enter the operator to perform the operation (+,-,/,*) ");
		char operator = sc.next().charAt(0);
		
		double res = 0;
		
		switch (operator) {
		
		case '+':
			res = firstNumber + secondNumber;
			break;

		case '-':
			res = firstNumber - secondNumber;
			break;
			
		case '*':
			res = firstNumber * secondNumber;
			break;
			
		case '/':
			res = firstNumber / secondNumber;
			break;
			
			
		default:
			System.out.println("Please enter the valid operator");
			break;
		}
		
		System.out.println("Result is : "+res);
		
		
		
	}
	

}
