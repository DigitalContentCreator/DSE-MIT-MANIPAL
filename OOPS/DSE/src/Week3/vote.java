package Week3;

import java.util.Scanner;

public class vote {

	    private int age;

	    public vote(int age) {
	        this.age = age;
	    }

	    public boolean isEligible() {
	        return age >= 18;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your age:");
	        int age = scanner.nextInt();

	        vote voting = new vote(age);

	        if (voting.isEligible()) {
	            System.out.println("You are eligible for voting.");
	        } else {
	            System.out.println("You are not eligible for voting.");
	        }
	    }
	}
