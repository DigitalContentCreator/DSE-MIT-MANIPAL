package Week1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	        int num, i;
	        long factorial = 1;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter an integer:");
	        num = input.nextInt();
	        if (num < 0)
	            System.out.println("Error: Factorial of negative number does not exist.");
	        else {
	            for (i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial of " + num + " is " + factorial);
	        }
	    }
	}

	