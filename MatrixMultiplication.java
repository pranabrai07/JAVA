import java.util.Scanner;

class MatrixMultiplication 
{

    	public static void main(String[] args) 
	{
        	Scanner in = new Scanner(System.in);

        	// Input Matrix A
        	System.out.print("Enter number of rows for matrix A: ");
        	int rowsA = in.nextInt();
        	System.out.print("Enter number of columns for matrix A: ");
        	int colsA = in.nextInt();
        	int[][] A = new int[rowsA][colsA];

        	System.out.println("Enter elements of matrix A:");
        	for (int i = 0; i < rowsA; i++) 
		{
            		for (int j = 0; j < colsA; j++) 
			{
                		System.out.print("Enter element [" + i + "][" + j + "]: ");
                		A[i][j] = in.nextInt();
			}
		}

        	// Input Matrix B
        	System.out.print("Enter number of rows for matrix B: ");
        	int rowsB = in.nextInt();
        	System.out.print("Enter number of columns for matrix B: ");
        	int colsB = in.nextInt();
        	int[][] B = new int[rowsB][colsB];

        	System.out.println("Enter elements of matrix B:");
        	for (int i = 0; i < rowsB; i++) 
		{
            		for (int j = 0; j < colsB; j++) 
			{
                		System.out.print("Enter element [" + i + "][" + j + "]: ");
                		B[i][j] = in.nextInt();
			}
		}

        	// Check if matrices can be multiplied
        	if (colsA != rowsB) 
		{
            		System.out.println("Cannot multiply the matrices. Inner dimensions must agree.");
            		return;
        	}

        	// Perform matrix multiplication
        	int[][] C = new int[rowsA][colsB];
        	for (int i = 0; i < rowsA; i++) 
		{
            		for (int j = 0; j < colsB; j++) 
			{
                		for (int k = 0; k < colsA; k++) 
				{
                    			C[i][j] += A[i][k] * B[k][j];
                		}
            		}
        	}

        	// Print Matrix A
        	System.out.println("\nMatrix A:");
        	for (int i = 0; i < rowsA; i++) 
		{
            		for (int j = 0; j < colsA; j++) 
			{
                		System.out.print(A[i][j]);
			}
			System.out.println();
		}

        	// Print Matrix B
        	System.out.println("\nMatrix B:");
		for (int i = 0; i < rowsB; i++) 
		{
            		for (int j = 0; j < colsB; j++) 
			{
                		System.out.print(B[i][j]);
			}
			System.out.println();
		}

        	// Print Result Matrix C
        	System.out.println("\nResult of A * B:");
		for (int i = 0; i < rowsA; i++) 
		{
            		for (int j = 0; j < colsB; j++) 
			{
                		System.out.print(C[i][j]);
			}
			System.out.println();
		}
    	}

}
