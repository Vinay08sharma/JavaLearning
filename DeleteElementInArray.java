
public class DeleteElementInArray {

	public static void main(String[] args) {

		int[] a = {22,44,53,65,656,445};
		int del_ele = 44;
		int count = 0;

		for(int i=0; i<a.length;i++)
		{
			if(del_ele == a[i])
			{
				for(int j = i;j<a.length-1;j++)
				{
					a[j] = a[j+1];
				}
				count++;
				break;
			}
		}

		if(count == 0)
		{
			System.out.println("Element not found");
		}

		else
		{
			System.out.println("Element deleted Successfully & new array numbers are ::");

			for(int i =0; i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
