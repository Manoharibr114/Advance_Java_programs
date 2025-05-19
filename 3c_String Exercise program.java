/* Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords() */
import java.util.Scanner;

public class CapitalizeWords {

	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return str;
	        String[] words = str.trim().split("\\s+");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty())
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.println("Capitalized: " + capitalizeWords(input));
	        sc.close();
	    }
	}


/* Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate() */

import java.util.Scanner;

public class StringTruncation {
	  public static String truncate(String str, int length) {
	        if (str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.print("Enter max length: ");
	        int len = sc.nextInt();
	        System.out.println("Truncated: " + truncate(input, len));
	    }
	

}

/* Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric() */

import java.util.Scanner;

public class NumericCheck {

	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to check if numeric: ");
	        String input = sc.nextLine();
	        if (isNumeric(input)) {
	            System.out.println("The string is numeric.");
	        } else {
	            System.out.println("The string is NOT numeric.");
	        }
	    }
	}


/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
*/

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random rand = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(rand.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter desired length: ");
	        int len = sc.nextInt();
	        System.out.println("Random String: " + generateRandomString(len));
	    }
	}
	

/* Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords() */

import java.util.Scanner;
public class WordCounter {
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        return str.trim().split("\\s+").length;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();
	        System.out.println("Word count: " + countWords(input));
	    }
	}


