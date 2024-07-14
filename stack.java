import java.util.Scanner;
class stack
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int[] arr= new int[5];
		int top=-1;
		while(true)
		{
			System.out.println("1.Push ");
			System.out.println("2.Pop ");
			System.out.println("3.Peek ");
			System.out.println("4.Display ");
			System.out.println("5.Exit ");		
			System.out.println("Enter your choice :");
			int n=in.nextInt();

			switch(n)
			{
				case 1:
					if(top>5)
					{
						System.out.println("Stack is overflow");
					}
					else
					{
						System.out.println("Enter the number: ");
						arr[++top]=in.nextInt();
					}
					break;
				case 2:
					if(top==-1)
					{
						System.out.println("Stack is empty");
					}
					else
					{
						System.out.println("The popped number is: "+arr[top] );
						top--;
					}
					break;
				case 3:
					if(top==-1)
					{
						System.out.println("Stack is overflow");
					}
					else
					{
						System.out.println("Top element is: "+arr[top]);
					}
					break;
				case 4:
					if(top==-1)
					{
						System.out.println("Stack is overflow");
					}
					else
					{
						for(int i=0; i<=top; i++)
						{
							System.out.println(arr[i]);
						}
					}
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
		}
	}
}
