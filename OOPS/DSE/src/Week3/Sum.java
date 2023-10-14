package Week3;

public class Sum {
	    public static void main(String[] args) {
	        int n = 10; // set n to the desired number of terms
	        double sum = 0.0;
	        for (int i = 1; i <= n; i++) {
	            double term = Math.pow(1.0 / i, i);
	            sum += term;
	        }
	        System.out.println("sum = " + sum);
	    }
	}
