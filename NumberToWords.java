import java.util.Scanner;

class NumberToWords 
{
	private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private static final String[] hun = {" ","One hunderd", "Two hunderd", "Three hunderd", "Four hunderd", "Five hunderd", "Six hunderd", "Seven hunderd", "Eight hunderd", "Nine hunderd"};

    	public static void main(String[] args) 
	{
        	Scanner in = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number= in.nextInt();
        	if (number == 0) 
		{
            		System.out.println("Zero ");
        	}

        	String words = "";

        	if (number >= 100) 
		{
            		words += hun[number / 100] + " ";
            		number %= 100;
        	}

        	if (number >= 20) 
		{
            		words += tens[number / 10] + " ";
            		number %= 10;
        	}

        	if (number > 0) 
		{
        		if (number < 10) 
			{
                		words += units[number];
            		} 
			else 
			{
                		words += teens[number - 10];
            		}
        	}
		System.out.println(words);
    	}
}