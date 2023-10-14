package Week5;

public class Complex {
	    private double real;
	    private double imaginary;

	    public Complex(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	    public Complex add(int num) {
	        return new Complex(this.real + num, this.imaginary);
	    }

	    public Complex add(Complex other) {
	        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	    }

	    public double getReal() {
	        return real;
	    }

	    public double getImaginary() {
	        return imaginary;
	    }

	    @Override
	    public String toString() {
	        if (imaginary >= 0) {
	            return real + " + " + imaginary + "i";
	        } else {
	            return real + " - " + (-imaginary) + "i";
	        }
	    }

	    public static void main(String[] args) {
	        Complex complex1 = new Complex(2.0, 3.0);
	        Complex complex2 = new Complex(1.0, 2.0);
	        int num = 5;

	        Complex result1 = complex1.add(num);
	        System.out.println("Result 1: " + result1);

	        Complex result2 = complex1.add(complex2);
	        System.out.println("Result 2: " + result2);
	    }
	}
