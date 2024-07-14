import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class list
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the list :");
		int n=in.nextInt();
	        List<Integer> list = new ArrayList<>();
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++)
		{
			list.add(in.nextInt());
		}
		int largest=list.get(0), smallest=list.get(0);
		for(int i=0; i<n; i++)
		{
			if(list.get(i)>largest)
			{
				largest=list.get(i);
			}
			if(list.get(i)<smallest)
			{
				smallest=list.get(i);
			}
		}
		System.out.println("Largest :"+largest);
		System.out.println("Smallest :"+smallest);

	}
}