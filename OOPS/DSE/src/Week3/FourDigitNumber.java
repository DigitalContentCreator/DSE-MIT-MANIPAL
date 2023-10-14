package Week3;

public class FourDigitNumber {
	
	    public static void main(String[] args) {
	        int[] digits = {1, 2, 3, 4};
	        boolean allowDuplicates = true; // set to false for case 2
	        generateCombinations(digits, allowDuplicates, "");
	    }

	    private static void generateCombinations(int[] digits, boolean allowDuplicates, String prefix) {
	        if (prefix.length() == 4) {
	            System.out.println(prefix);
	            return;
	        }

	        for (int i = 0; i < digits.length; i++) {
	            if (!allowDuplicates && prefix.indexOf(digits[i]) != -1) {
	                continue;
	            }
	            generateCombinations(digits, allowDuplicates, prefix + digits[i]);
	        }
	    }
	}
