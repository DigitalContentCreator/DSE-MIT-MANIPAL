package Week2;

public class Expression {
	    public static void main(String[] args) {
	        int a = 5;
	        int b = 10;

	        // Expression a
	        int result1 = (a << 2) + (b >> 2);
	        System.out.println("(a << 2) + (b >> 2) = " + result1);

	        // Expression b
	        boolean result2 = b > 0;
	        System.out.println("b > 0 = " + result2);

	        // Expression c
	        int result3 = (a + b * 100) / 10;
	        System.out.println("(a + b * 100) / 10 = " + result3);

	        // Expression d
	        int result4 = a & b;
	        System.out.println("a & b = " + result4);
	    }
	}
