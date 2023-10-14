package Week2;

import java.util.Scanner;

public class readnumber {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter an integer number: ");
	    int num1 = sc.nextInt();
	    byte b1 = (byte) num1;
	    System.out.println("Byte value of " + num1 + " is " + b1);

	    System.out.print("Enter a double number: ");
	    double num2 = sc.nextDouble();
	    byte b2 = (byte) num2;
	    int i2 = (int) num2;
	    System.out.println("Byte value of " + num2 + " is " + b2);
	    System.out.println("Integer value of " + num2 + " is " + i2);

	    System.out.print("Enter a character: ");
	    char c = sc.next().charAt(0);
	    int i3 = c;
	    System.out.println("Integer value of " + c + " is " + i3);
	  }
	}

