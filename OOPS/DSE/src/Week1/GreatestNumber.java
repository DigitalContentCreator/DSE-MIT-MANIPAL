package Week1;

public class GreatestNumber {
	    private int num1;
	    private int num2;
	    private int num3;

	    public GreatestNumber(int num1, int num2, int num3) {
	        this.num1 = num1;
	        this.num2 = num2;
	        this.num3 = num3;
	    }

	    public int findGreatest() {
	        int greatest = num1;

	        if (num2 > greatest) {
	            greatest = num2;
	        }

	        if (num3 > greatest) {
	            greatest = num3;
	        }

	        return greatest;
	    }

	    public static void main(String[] args) {
	        int number1 = 10;
	        int number2 = 20;
	        int number3 = 15;

	        GreatestNumber greatestNumber = new GreatestNumber(number1, number2, number3);
	        int greatest = greatestNumber.findGreatest();
	        System.out.println("The greatest number among " + number1 + ", " + number2 + ", and " + number3 + " is: " + greatest);
	    }
	    
	}
	


