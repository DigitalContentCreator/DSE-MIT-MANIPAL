package Week6;

public class StringAnalyzer {
	    private String inputString;
	    private int charCount;
	    private int wordCount;
	    private int lineCount;
	    private int vowelCount;

	    public StringAnalyzer(String inputString) {
	        this.inputString = inputString;
	        this.charCount = 0;
	        this.wordCount = 0;
	        this.lineCount = 0;
	        this.vowelCount = 0;
	    }

	    public void analyze() {
	        String[] lines = inputString.split("\\r?\\n");
	        lineCount = lines.length;

	        for (String line : lines) {
	            charCount += line.length();
	            wordCount += line.split("\\s+").length;

	            for (char c : line.toCharArray()) {
	                if ("AEIOUaeiou".indexOf(c) != -1) {
	                    vowelCount++;
	                }
	            }
	        }
	    }

	    public void displayResults() {
	        System.out.println("Number of characters: " + charCount);
	        System.out.println("Number of words: " + wordCount);
	        System.out.println("Number of lines: " + lineCount);
	        System.out.println("Number of vowels: " + vowelCount);
	    }
	}

	 class Main {
	    public static void main(String[] args) {
	        String inputString = "This is a sample string.\nIt has multiple lines.\nAnd some vowels.";

	        StringAnalyzer analyzer = new StringAnalyzer(inputString);
	        analyzer.analyze();
	        analyzer.displayResults();
	    }
	}
