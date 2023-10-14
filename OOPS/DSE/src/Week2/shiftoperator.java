package Week2;

public class shiftoperator {
	    public static void main(String[] args) {
	        int num = 5;
	        int n = 3;

	        // Multiplication by 2^n
	        int result1 = num << n;
	        System.out.println(num + " * 2^" + n + " = " + result1);

	        // Division by 2^n
	        int result2 = num >> n;
	        System.out.println(num + " / 2^" + n + " = " + result2);
	    }
	}
