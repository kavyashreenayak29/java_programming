//Exercises
//1b. ArrayList Programs
//1.Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
import java.util.*;

public class ArrayListColorCheck {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Colors: " + colors);

        boolean hasRed = colors.contains("Red");
        System.out.println("Contains 'Red'? " + hasRed);
    }
}

//2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
import java.util.*;

public class ArrayListRemoveColor {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original colors: " + colors);

        colors.remove(1); 
        colors.remove("Blue"); 
        System.out.println("After removals: " + colors);
    }
}

//3.Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;

public class ArrayListSortColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Before sorting: " + colors);

        Collections.sort(colors);
        System.out.println("After sorting: " + colors);
    }
}

//4.Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;

public class ArrayListSubList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> subList = colors.subList(0, 2);
        System.out.println("Sublist (1st and 2nd): " + subList);
    }
}

//5.Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.*;

public class ArrayListRemoveNth {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));
        int n = 3; 
        if (n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing " + (n + 1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}
