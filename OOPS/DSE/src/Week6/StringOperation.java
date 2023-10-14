package Week6;

import java.util.Scanner;

public class StringOperation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        System.out.println("1. Check whether the string is a palindrome or not.");
	        System.out.println("2. Write the string in alphabetical order.");
	        System.out.println("3. Reverse the string.");
	        System.out.println("4. Concatenate the original string and the reversed string.");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                if (isPalindrome(str)) {
	                    System.out.println(str + " is a palindrome.");
	                } else {
	                    System.out.println(str + " is not a palindrome.");
	                }
	                break;
	            case 2:
	                String sortedStr = sortString(str);
	                System.out.println("The sorted string is: " + sortedStr);
	                break;
	            case 3:
	                String reversedStr = reverseString(str);
	                System.out.println("The reversed string is: " + reversedStr);
	                break;
	            case 4:
	                String concatenatedStr = concatenateString(str);
	                System.out.println("The concatenated string is: " + concatenatedStr);
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return str.equals(sb.toString());
	    }

	    public static String sortString(String str) {
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray);
	        return new String(charArray);
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return sb.toString();
	    }

	    public static String concatenateString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return str + sb.toString();
	    }
	}
