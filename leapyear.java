import java.util.Scanner;
class leapyear
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year :");
		int n=in.nextInt();
		boolean year=false;
		if(n%4==0)
		{
			year=true;
			if(n%100==0)
			{
				if(n%400==0)
				{
					year=true;
				}
				else
				{
					year=false;
				}
			}
		}
		if(year==true)
		{
			System.out.println(n +" is a leap year");
		}
		else
		{
			System.out.println(n +" is not a leap year");
		}
	}
}