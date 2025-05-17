//2a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison, String 
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith().

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Character at index 1 of String 1: " + str1.charAt(1));
        System.out.println("String 1 equals String 3: " + str1.equals(str3));
        System.out.println("String 1 compareTo String 2: " + str1.compareTo(str2));
        System.out.println("Index of 'l' in String 1: " + str1.indexOf('l'));
        System.out.println("Substring from index 1 to 4 in String 1: " + str1.substring(1, 4));
        System.out.println("Uppercase String 1: " + str1.toUpperCase());
        System.out.println("Lowercase String 2: " + str2.toLowerCase());

        String strWithSpace = "  AIET College  ";
        System.out.println("Trimmed String: '" + strWithSpace.trim() + "'");

        String fullName = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + fullName);

        String csv = "apple,banana,grapes";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder Output: " + sb.toString());

        String formatted = String.format("My name is %s and I am %d years old.", "Chethan", 21);
        System.out.println("Formatted String: " + formatted);

        String email = "student@aiet.edu.in";
        System.out.println("Email contains '@': " + email.contains("@"));
        System.out.println("Email starts with 'student': " + email.startsWith("student"));
        System.out.println("Email ends with '.edu.in': " + email.endsWith(".edu.in"));
    }
}


//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");
    }
}
