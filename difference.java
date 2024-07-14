import java.util.Scanner;
class difference
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n=in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
		int largest=arr[0], smallest=arr[0], difference=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		difference=largest-smallest;
		System.out.println("Difference :"+difference);
	}
}