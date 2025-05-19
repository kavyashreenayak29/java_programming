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
