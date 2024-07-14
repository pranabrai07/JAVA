import java.util.Scanner; 
class BinarySearch 
{ 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: "); 
        int n = in.nextInt(); 
        int[] arr = new int[n]; 
        System.out.println("Enter " + n + " sorted integers:"); 

        for (int i = 0; i < n; i++) 
	{ 
            arr[i] = in.nextInt(); 
        } 
        System.out.print("Enter the element to search: "); 
        int target = in.nextInt(); 
        int index = binarySearch(arr, target); 
 
        if (index != -1)
	{ 
            System.out.println(target + " found at index " + index); 
        } 
	else 
	{ 
            System.out.println(target + " not found in the array."); 
        } 
    } 
    // Binary search method 
    public static int binarySearch(int[] arr, int target) 
	{ 
        int left = 0; 
        int right = arr.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            // Check if target is present at mid 
            if (arr[mid] == target) 
	    { 
                return mid; 
            } 
            // If target is greater, ignore left half 
            if (arr[mid] < target)
	    { 
                left = mid + 1; 
            } 
            // If target is smaller, ignore right half 
            else 
	    { 
                right = mid - 1; 
            } 
        } 
        // Element is not present in array 
        return -1; 
    } 
}