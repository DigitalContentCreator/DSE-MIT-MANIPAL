package Week1;

import java.util.Scanner;

public class PrintTable {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Multiplication Table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	        
	        scanner.close();
	    }
	}
