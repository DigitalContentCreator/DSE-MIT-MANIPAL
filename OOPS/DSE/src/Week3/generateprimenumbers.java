package Week3;

public class generateprimenumbers {
	    public static void main(String[] args) {
	        int n = 10; // set n to the desired starting number
	        int m = 50; // set m to the desired ending number
	        for (int i = n; i <= m; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
