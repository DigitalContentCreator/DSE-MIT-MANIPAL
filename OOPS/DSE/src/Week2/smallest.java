package Week2;

public class smallest {
	    public static void main(String[] args) {
	        int a = 5;
	        int b = 10;
	        int c = 3;

	        // Find the largest number
	        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	        System.out.println("Largest number is " + largest);

	        // Find the smallest number
	        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
	        System.out.println("Smallest number is " + smallest);
	    }
	}
