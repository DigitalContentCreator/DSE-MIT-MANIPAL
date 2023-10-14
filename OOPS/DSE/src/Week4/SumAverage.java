package Week4;

import java.util.Arrays;

public class SumAverage {

	    public static void main(String[] args) {
	        int[] intArray = {12, 67, 87, 34, 90, 23, 67, 88};
	        int sum = Arrays.stream(intArray).sum();
	        double average = Arrays.stream(intArray).average().orElse(Double.NaN);
	        System.out.println("The sum of all elements in the array is: " + sum);
	        System.out.println("The average of all elements in the array is: " + average);
	    }
	}
