import java.util.Scanner; 
class factorials 
{ 
    	public static void main(String[] args) 
	{ 
        	Scanner scanner = new Scanner(System.in); 
        	System.out.print("Enter a non-negative integer: "); 
        	int n = scanner.nextInt(); 
        	long factorial = calculateFactorial(n); 
        	System.out.println("Factorial of " + n + " is: " + factorial);  
    	} 
    	long calculateFactorial(int n) 
	{ 
        	if (n == 0) 
		{ 
            		return 1; 
        	} 
        	return n * calculateFactorial(n - 1); 
	}
}