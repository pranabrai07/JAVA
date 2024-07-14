import java.util.Scanner; 
class Oddno 
{ 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: "); 
        int n = in.nextInt(); 
        int[] arr = new int[n]; 
        System.out.println("Enter the integers:"); 
	int c=0;
        for (int i = 0; i < n; i++) 
	{ 
            arr[i] = in.nextInt(); 
        } 
	for (int i = 0; i < n; i++)
	{   
        	if (arr[i]%2 !=0)
		{ 
            		c++; 
        	}
	} 
	System.out.print("The number of odd numbers in the array is: "+c);
    } 
}