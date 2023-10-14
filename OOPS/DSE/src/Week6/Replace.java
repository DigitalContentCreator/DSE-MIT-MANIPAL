package Week6;

import java.util.Scanner;

public class Replace {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = sc.nextLine();
	        System.out.print("Enter a character to replace the word with: ");
	        char ch = sc.next().charAt(0);
	        String result = replace(word, ch);
	        System.out.println("Result: " + result);
	    }

	    public static String replace(String word, char ch) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i) == ' ') {
	                sb.append(' ');
	            } else {
	                sb.append(new String(new char[word.charAt(i) == ch ? 2 : 1]).replace('\0', word.charAt(i)));
	            }
	        }
	        return sb.toString();
	    }
	}
