//3a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith().

package String_Functions;
public class StringHandlingDemo {
public static void main(String[] args) {
// Basic String Creation
System.out.println("=== String Creation and Basic Operations ===");
String str1 = "Hello, World!";
String str2 = new String("Java Programming");
System.out.println("Original strings:");
System.out.println("str1: " + str1);
System.out.println("str2: " + str2);
// Length and Character Access
System.out.println("\n=== Length and Character Access ===");
System.out.println("Length of str1: " + str1.length());
System.out.println("Character at index 4 in str1: " + str1.charAt(4));
// String Comparison
System.out.println("\n=== String Comparison ===");
String str3 = "hello, world!";
System.out.println("str1 equals str3: " + str1.equals(str3));
System.out.println("str1 equals str3 (ignore case): " + str1.equalsIgnoreCase(str3));
System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
// Searching in Strings
System.out.println("\n=== String Searching ===");
System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));
System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));
System.out.println("str1 contains 'Hello': " + str1.contains("Hello"));
// Substring Operations
System.out.println("\n=== Substring Operations ===");
System.out.println("Substring of str1 (7 to end): " + str1.substring(7));
System.out.println("Substring of str1 (0 to 5): " + str1.substring(0, 5));
// String Modification
System.out.println("\n=== String Modification ===");
System.out.println("Uppercase: " + str1.toUpperCase());
System.out.println("Lowercase: " + str1.toLowerCase());
System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

// Whitespace Handling
System.out.println("\n=== Whitespace Handling ===");
String spacedString = " Trimming Example ";
System.out.println("Original: '" + spacedString + "'");
System.out.println("After trim: '" + spacedString.trim() + "'");
// String Concatenation
System.out.println("\n=== String Concatenation ===");
String concat1 = "Hello";
String concat2 = "World";
System.out.println("Using + operator: " + concat1 + " " + concat2);
System.out.println("Using concat(): " + concat1.concat(" ").concat(concat2));
// String Splitting
System.out.println("\n=== String Splitting ===");
String csvText = "Java,Python,C++,JavaScript";
System.out.println("Original CSV: " + csvText);
String[] languages = csvText.split(",");
System.out.println("After splitting:");
for (int i = 0; i < languages.length; i++) {
System.out.println("Language " + (i + 1) + ": " + languages[i]);
}
// String Building with StringBuilder
System.out.println("\n=== StringBuilder Demo ===");
StringBuilder builder = new StringBuilder();
builder.append("Learning ");
builder.append("Java ");
builder.append("Programming");
System.out.println("StringBuilder result: " + builder.toString());
builder.insert(9, "Core ");
System.out.println("After insert: " + builder.toString());
builder.reverse();
System.out.println("After reverse: " + builder.toString());
// String Formatting
System.out.println("\n=== String Formatting ===");
String formatted = String.format("Name: %s, Age: %d, Height: %.2f", "John", 25, 1.75);
System.out.println("Formatted string: " + formatted);
// Checking String Properties
System.out.println("\n=== String Properties ===");
String testString = "Java123";
System.out.println("Is empty: " + testString.isEmpty());
System.out.println("Starts with 'Ja': " + testString.startsWith("Ja"));
System.out.println("Ends with '123': " + testString.endsWith("123"));
// Practical Example: Email Validation
System.out.println("\n=== Practical Example: Email Validation ===");

String email = "user@example.com";
boolean isValidEmail = validateEmail(email);
System.out.println("Email: " + email);
System.out.println("Is valid: " + isValidEmail);
}
// Helper method for email validation
private static boolean validateEmail(String email) {
// Basic email validation
return email != null &&
email.contains("@") &&
email.contains(".") &&
email.indexOf("@") < email.lastIndexOf(".") &&
!email.startsWith("@") &&
!email.endsWith(".") &&
email.length() >= 5;
}
}


// 3c. String Exercise progams
//6.Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords().
package String_Functions;

public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "java is fun";
        System.out.println(capitalize(input));
    }

    public static String capitalize(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }
}

//7.Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate().
package String_Functions;

public class TruncateString {
    public static void main(String[] args) {
        String input = "This is a long sentence";
        System.out.println(truncate(input, 10));
    }

    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }
}

//8.Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric().
package String_Functions;

public class NumericCheck {
    public static void main(String[] args) {
        String input = "123456";
        System.out.println(isNumeric(input));
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}

//9.Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString().
package String_Functions;
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        System.out.println(generateRandom(8));
    }

    public static String generateRandom(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}

//10.Write a Java Program for Counting the number of words in a string using user defined function countWords().
package String_Functions;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Java is a programming language";
        System.out.println(countWords(input));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
}
