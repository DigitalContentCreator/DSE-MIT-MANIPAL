package Week1;

import java.time.LocalDate;
import java.time.Period;

public class Retirement {
	    public static void main(String[] args) {
	        LocalDate dateOfBirth = LocalDate.of(1980, 6, 15); // Replace with the actual date of birth
	        int yearsOfService = 30; // Replace with the actual years of service
	        
	        // Calculate the retirement age (60 years)
	        int retirementAge = 60;
	        
	        // Calculate the retirement date
	        LocalDate retirementDate = dateOfBirth.plusYears(retirementAge);
	        
	        // Adjust the retirement date based on years of service
	        if (yearsOfService < retirementAge) {
	            retirementDate = retirementDate.minusYears(retirementAge - yearsOfService);
	        } else {
	            System.out.println("Years of service exceed or equal retirement age.");
	        }
	        
	        System.out.println("Date of Birth: " + dateOfBirth);
	        System.out.println("Years of Service: " + yearsOfService);
	        System.out.println("Retirement Date: " + retirementDate);
	    }
	}
