//3b. String Exercise progams
//1.Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
package String_Functions;

public class NullOrEmptyCheck {
    public static void main(String[] args) {
        String input = "   ";
        System.out.println(isNullOrEmpty(input));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}


//2.Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences().
package String_Functions;

public class SubstringCounter {
    public static void main(String[] args) {
        String main = "hello world hello";
        String sub = "hello";
        System.out.println(countOccurrences(main, sub));
    }

    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}

//3.Write a Java Program for Reversing the characters in a string using user defined function reverseString().
package String_Functions;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Java";
        System.out.println(reverse(input));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

//4.Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome().
package String_Functions;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "Madam, in Eden, I'm Adam";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}

//5.Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace().
package String_Functions;

public class WhitespaceRemover {
    public static void main(String[] args) {
        String input = "  Java   Programming  ";
        System.out.println(removeSpaces(input));
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}
