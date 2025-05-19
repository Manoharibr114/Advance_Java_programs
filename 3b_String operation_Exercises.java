/* 3b. String Exercise progams
Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty(). */

import java.util.Scanner;

public class StringCheck {
	    // User-defined function to check null or only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or contains only whitespace.");
	        } else {
	            System.out.println("The string is not null and has visible characters.");
	        }

	        scanner.close();
	    }
	}


/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() */
import java.util.Scanner;
public class SubstringCount{
	
	    // User-defined function to count substring occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move past the last match
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        System.out.print("Enter the substring to count: ");
	        String subStr = scanner.nextLine();

	        int result = countOccurrences(mainStr, subStr);
	        System.out.println("The substring '" + subStr + "' appears " + result + " times.");

	        scanner.close();
	    }
	}

/* Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString(). */

import java.util.Scanner;

public class StringReversal {
	
	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	}

/* Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():  */

import java.util.Scanner;
public class PalindromeCheck {

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    // User-defined function to check if a string is a palindrome (ignoring case and punctuation)
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = reverseString(cleaned);

	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to check if it is a palindrome: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}


/* Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace() */

import java.util.Scanner;
public class RemoveWhitespace {
	
	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to remove whitespace: ");
	        String input = scanner.nextLine();

	        String result = removeWhitespace(input);
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }
	}




