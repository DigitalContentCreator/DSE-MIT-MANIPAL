package Week2;

import java.util.Scanner;

public class bitwiseoperator {

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter first number: ");
	    int num1 = sc.nextInt();

	    System.out.print("Enter second number: ");
	    int num2 = sc.nextInt();

	    int sum = num1 ^ num2;
	    int carry = (num1 & num2) << 1;
	    int result = sum ^ carry;

	    if ((result & 1) == 0)
	      System.out.println(result + " is an even number.");
	    else
	      System.out.println(result + " is an odd number.");
	  }
	}
