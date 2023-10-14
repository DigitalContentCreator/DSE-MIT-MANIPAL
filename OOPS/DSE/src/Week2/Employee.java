package Week2;

public class Employee {
	    private String name;
	    private double hours;
	    private double rate;

	    public Employee(String name, double hours, double rate) {
	        this.name = name;
	        this.hours = hours;
	        this.rate = rate;
	    }

	    public double calculateSalary() {
	        double salary = 0.0;
	        if (hours <= 40) {
	            salary = hours * rate;
	        } else {
	            salary = (40 * rate) + ((hours - 40) * (rate * 1.5));
	        }
	        return salary;
	    }

	    public static void main(String[] args) {
	        Employee employee = new Employee("Atharv", 45.0, 10.0);
	        System.out.println("Employee Name: " + employee.name);
	        System.out.println("Hours Worked: " + employee.hours);
	        System.out.println("Hourly Rate: " + employee.rate);
	        System.out.println("Salary: " + employee.calculateSalary());
	    }
	}
