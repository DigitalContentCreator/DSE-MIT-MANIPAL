package Week2;

public class Swap {
	    private String str;
	    private int num;

	    public Swap(String str, int num) {
	        this.str = str;
	        this.num = num;
	    }

	    public void swap() {
	        String tempStr = String.valueOf(num);
	        int tempNum = Integer.parseInt(str);

	        str = tempStr;
	        num = tempNum;
	    }

	    public String getString() {
	        return str;
	    }

	    public int getNumber() {
	        return num;
	    }

	    public static void main(String[] args) {
	        Swap swapObject = new Swap("hello", 123);
	        System.out.println("Before swap:");
	        System.out.println("String: " + swapObject.getString());
	        System.out.println("Number: " + swapObject.getNumber());

	        swapObject.swap();

	        System.out.println("After swap:");
	        System.out.println("String: " + swapObject.getString());
	        System.out.println("Number: " + swapObject.getNumber());
	    }
	}