package Week3;

import java.util.Scanner;

public class PrimeNumber {

	    private int number;

	    public PrimeNumber(int number) {
	        this.number = number;
	    }

	    public boolean isPrime() {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();

	        PrimeNumber primeNumber = new PrimeNumber(number);

	        if (primeNumber.isPrime()) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}
