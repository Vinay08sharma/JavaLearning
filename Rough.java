import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.ietf.jgss.Oid;

public class Rough {

	
//	public static void main(String[] args) {
//		
//		String str = "AHCECLWLXO";
//		
//		String[] a = str.split("");
//		
//		for(int i =1; i<a.length;i=i+2)
//		{
//			System.out.print(a[i].toUpperCase());
//		}
		
		
//		Scanner sc  = new Scanner(System.in);
//		int flag = 1;
//		System.out.print("Enter the first number :: ");
//		int firstNo = sc.nextInt();
//		System.out.print("Enter the first number :: ");
//		int secondNo = sc.nextInt();
//		
//		for(int i = firstNo;i<secondNo;i++)
//		{
//			for(int j = 2;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					flag = 1;
//					break;
//				}
//				else
//					flag = 0;
//				
//			}
//			if(flag==0)
//			{
//				System.out.print(i+" ");
//				
//				
//			}
//		}
//		
//	
		
//		if(firstNo<0)
//		{
//			System.out.println("Number should not be negative");
//		}
//		
//		else
//		{
//			for(int i = 1;i<=firstNo;i++)
//			{
//				flag = flag*i;
//			}
//		
//		}
//		System.out.println(flag);
////		
//		String[] items = {"A","B","C","D","E","F","G"};
//		
//		ArrayList<String> originalArray = new ArrayList<>(Arrays.asList(items));
//		ArrayList<String> newArray = new ArrayList<>();
//		
//		newArray.addAll(originalArray);
//		
//		newArray.add("NOW I KNOW MY ABCs");
//		
//		newArray.add(0, "12345");
//		
//		newArray.subList(4, 8).clear();
//		
//		newArray.remove(0);
//		
//		for(String s : newArray)
//		System.out.print(s+" ");
//		
		
//		
//		int[] a = {2,3,0,0,5,0,8};
//		int temp = 0;
//		int count = 0;
//		
//		for(int i = 0;i<a.length-1;i++)
//		{
//			if(a[i]!=0)
//			{
//				temp = a[count];
//				a[count] = a[i];
//				a[i] = temp;
//				count = count +1;
//			}
//			
//			
//		}
//		
//		for(int a1 : a)
//		{
//			System.out.print(a1);
//		}
		
		

		
		public static int isEven(int n)
		{
			return(n & 1);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(isEven(num)==0)
			{
				System.out.println("even");
			}
			
			else
				System.out.println("odd");
		}



	
}
