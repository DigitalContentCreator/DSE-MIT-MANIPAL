package Week1;

public class YearOfJoinng {
	    public static void main(String[] args) {
	        String registrationNumber = "22******"; // Replace with the actual 9-digit registration number
	        
	        // Extract the first two digits
	        String yearDigits = registrationNumber.substring(0, 2);
	        
	        // Convert the year digits to an integer
	        int year = Integer.parseInt(yearDigits);
	        
	        // Assuming the academic year starts from 2000
	        int baseYear = 2000;
	        
	        // Calculate the actual year of joining
	        int joiningYear = baseYear + year;
	        
	        System.out.println("Year of Joining: " + joiningYear);
	    }
	}
