/*
1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not */
import java.util.*;
public class ColorSearch {
	
	    public static void main(String[] args) {
	        // Creating an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding elements to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Displaying all colors
	        System.out.println("Colors: " + colors);

	        // Searching for "Red" in the list
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available.");
	        } else {
	            System.out.println("Color 'Red' is not available.");
	        }
	    }
	}

/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList  */

import java.util.ArrayList;
public class ColorList {

	    public static void main(String[] args) {
	        // Creating an ArrayList with color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");
	        colors.add("Green"); // index 1 (2nd element)
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1);
	        }

	        // Remove "Blue" from the list
	        colors.remove("Blue");

	        // Display updated list
	        System.out.println("After removals: " + colors);
	    }
	}


/* 3.
 Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj) */

import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
	
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding unsorted colors
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        System.out.println("Before Sorting: " + colors);

	        // Sorting the ArrayList alphabetically
	        Collections.sort(colors);

	        // Display sorted list
	        System.out.println("After Sorting: " + colors);
	    }
	}

/* 4. Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList() */

import java.util.ArrayList;
import java.util.List;
public class ColorExtractor{

	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");    // index 0
	        colors.add("Green");  // index 1
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original List: " + colors);

	        // Extracting sublist from index 0 to 2 (1st and 2nd elements)
	        List<String> subColors = colors.subList(0, 2);

	        // Displaying the sublist
	        System.out.println("Extracted Sublist (1st and 2nd): " + subColors);
	    }
	}

/* 5. Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */ 
import java.util.ArrayList;
import java.util.Scanner;


public class ColorRemover {
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors
	        colors.add("Red");     // index 0
	        colors.add("Green");   // index 1
	        colors.add("Blue");    // index 2
	        colors.add("Yellow");  // index 3

	        Scanner scanner = new Scanner(System.in);

	        // Display the original list
	        System.out.println("Original List: " + colors);

	        // Ask the user for the index to delete
	        System.out.print("Enter index (0-based) to remove: ");
	        int index = scanner.nextInt();

	        // Check if the index is valid
	        if (index >= 0 && index < colors.size()) {
	            // Remove element at the given index
	            colors.remove(index);
	            System.out.println("After removing element at index " + index + ": " + colors);
	        } else {
	            System.out.println("Invalid index.");
	        }

	        scanner.close(); // Close the scanner
	    }
	}


