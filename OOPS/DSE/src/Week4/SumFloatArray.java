package Week4;

public class SumFloatArray {
	    public static void main(String[] args) {
	        float[] floatArray = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
	        float sum = 0.0f;
	        for (float element : floatArray) {
	            sum += element;
	        }
	        System.out.println("The sum of all elements in the array is: " + sum);
	    }
	}
