package Week5;

public class overloading {
	    private String name;
	    private int age;

	    public overloading() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    public overloading(String name) {
	        this.name = name;
	        this.age = 0;
	    }

	    public overloading(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void introduce() {
	        System.out.println("Hi, I'm " + name + ".");
	    }

	    public void introduce(String greeting) {
	        System.out.println(greeting + ", I'm " + name + ".");
	    }

	    public void introduce(String greeting, int times) {
	        for (int i = 0; i < times; i++) {
	            System.out.println(greeting + " (x" + (i + 1) + ") - I'm " + name + ".");
	        }
	    }

	    public void celebrateBirthday() {
	        this.age++; 
	        System.out.println("Happy Birthday, " + this.name + "! You are now " + this.age + " years old.");
	    }

	    public static void main(String[] args) {
	    	overloading person1 = new overloading();
	    	overloading person2 = new overloading("Rocky");
	    	overloading person3 = new overloading("Maharaj", 30);

	        person1.introduce();
	        person2.introduce("Hello");
	        person3.introduce("Hi", 3);

	        person2.celebrateBirthday();
	    }
	}
