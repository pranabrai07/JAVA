import java.util.Scanner; 
class Palindrome 
{ 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the string you want: "); 
        String n = in.nextLine();
	String m="";
	int l=n.length(); 
        for(int i=l-1; i>=0; i--)
	{
		m=m + n.charAt(i);
	}
	System.out.println(m);
	if(n.equals(m)==true)
	{
		System.out.print(n+" is a palindrome ");
	}
	else
	{
		System.out.print(n+" is not a palindrome ");
	}

    } 
}