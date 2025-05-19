/* 3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith() */

public class StringHandlingDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "Hello";
	        System.out.println("str1 equals str3: " + str1.equals(str3));
	        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String str4 = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + str4.indexOf("Java"));
	        System.out.println("Contains 'Programming': " + str4.contains("Programming"));

	        // 5. Substring Operations
	        System.out.println("Substring (11 to 15): " + str4.substring(11, 15));

	        // 6. String Modification
	        System.out.println("Replace 'Java' with 'Python': " + str4.replace("Java", "Python"));

	        // 7. Whitespace Handling
	        String str5 = "   Trim Me   ";
	        System.out.println("Original: '" + str5 + "'");
	        System.out.println("Trimmed: '" + str5.trim() + "'");

	        // 8. String Concatenation
	        String combined = str1 + " " + str2;
	        System.out.println("Concatenated: " + combined);

	        // 9. String Splitting
	        String str6 = "Red,Green,Blue";
	        String[] colors = str6.split(",");
	        System.out.println("Splitted colors:");
	        for (String color : colors) {
	            System.out.println("- " + color);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        sb.insert(0, "Welcome to ");
	        sb.replace(11, 15, "Python");
	        sb.delete(0, 11);
	        System.out.println("StringBuilder Result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        System.out.println(String.format("Name: %s, Age: %d", name, age));

	        // 12. Email Validation
	        String email = "test@example.com";
	        if (email.contains("@") && email.startsWith("test") && email.endsWith(".com")) {
	            System.out.println("Valid Email: " + email);
	        } else {
	            System.out.println("Invalid Email: " + email);
	        }
	    }
	}

