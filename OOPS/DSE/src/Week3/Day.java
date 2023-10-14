package Week3;

import java.util.Scanner;

public class Day {

	    private int day;

	    public Day(int day) {
	        this.day = day;
	    }

	    public String getDayOfWeek() {
	        switch (day) {
	            case 1:
	                return "Monday";
	            case 2:
	                return "Tuesday";
	            case 3:
	                return "Wednesday";
	            case 4:
	                return "Thursday";
	            case 5:
	                return "Friday";
	            case 6:
	                return "Saturday";
	            case 7:
	                return "Sunday";
	            default:
	                return "Invalid day";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the day of the date:");
	        int day = scanner.nextInt();

	        Day dayOfWeek = new Day(day);

	        System.out.println(dayOfWeek.getDayOfWeek());
	    }
	}
