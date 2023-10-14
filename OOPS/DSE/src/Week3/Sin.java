package Week3;

public class Sin {
	    public static void main(String[] args) {
	        double x = 1.0; // set x to the desired value
	        int n = 10; // set n to the desired number of terms
	        double sum = 0.0;
	        int sign = 1;
	        for (int i = 1; i <= n; i += 2) {
	            double term = sign * Math.pow(x, i) / factorial(i);
	            sum += term;
	            sign *= -1;
	        }
	        System.out.println("sin(" + x + ") = " + sum);
	    }

	    private static int factorial(int n) {
	        int result = 1;
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }
	}
