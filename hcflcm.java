import java.util.Scanner;
class hcflcm
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int n1=in.nextInt();
		System.out.println("Enter the second number :");
		int n2=in.nextInt();
		int hcf, lcm, num1=n1, num2=n2;
		while(num2!=0)
		{
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		hcf=num1;
		lcm=(n1*n2)/hcf;
		System.out.println("HCF :"+hcf);
		System.out.println("LCM :"+lcm);
	}
}