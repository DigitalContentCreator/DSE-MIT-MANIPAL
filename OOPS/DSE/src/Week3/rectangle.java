package Week3;

import java.util.Scanner;

	class Rectangle {
	    private double length;
	    private double breadth;

	    // Constructor
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return length * breadth;
	    }

	    // Method to calculate circumference
	    public double calculateCircumference() {
	        return 2 * (length + breadth);
	    }
	}

	public class rectangle {
	    public static void main(String[] args) {
	        // Create a rectangle object
	        Rectangle rectangle = new Rectangle(5.0, 3.0);

	        // Calculate area and circumference
	        double area = rectangle.calculateArea();
	        double circumference = rectangle.calculateCircumference();

	        // Display results
	        System.out.println("Rectangle Area: " + area);
	        System.out.println("Rectangle Circumference: " + circumference);
	    }
	}
