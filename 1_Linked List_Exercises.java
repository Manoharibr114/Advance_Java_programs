/* 1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) */
import java.util.*;

public class LinkedListInteratorExample {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements to the list
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Creating an iterator starting from index 1 (second element)
	        Iterator<String> iterator = list.listIterator(1);

	        System.out.println("Iterating from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}

/* 2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator()) */

import java.util.*;

public class ReverseLInkedListInteration {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding elements to the list
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Getting a descending (reverse) iterator
	        Iterator<String> descendingIterator = list.descendingIterator();

	        System.out.println("Iterating in reverse order:");
	        while (descendingIterator.hasNext()) {
	            System.out.println(descendingIterator.next());
	        }
	    }
	}


/* 3. Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))
*/
import java.util.*;
public class InsertAtEnd {
	public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");
	        list.add("Green");

	        // Inserting element at the end using offerLast
	        list.offerLast("Pink");

	        System.out.println("LinkedList after inserting at end: " + list);
	    }
	}

/* 4. Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) ) */

import java.util.*;
public class DisplayElementsWithPositions {

	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        // Displaying elements with their positions
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Element at position " + i + ": " + list.get(i));
	        }
	    }
	}

/* 5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))  */

import java.util.*;
public class SwapElementInLinkedList {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding some elements
	        list.add("Red");    // index 0
	        list.add("Green");  // index 1
	        list.add("Blue");   // index 2

	        System.out.println("Original list: " + list);

	        // Swapping first (index 0) and third (index 2) elements
	        Collections.swap(list, 0, 2);

	        System.out.println("List after swapping 1st and 3rd elements: " + list);
	    }
	}

