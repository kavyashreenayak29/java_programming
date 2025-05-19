//1c. LinkedList Programs
//1.Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;

public class LinkedListIterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Iterator<String> iterator = list.listIterator(1); // Start from 2nd (index 1)
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//2.Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
import java.util.*;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Iterator<String> descIterator = list.descendingIterator();
        System.out.println("Reverse iteration:");
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}

//3.Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
import java.util.*;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green"));
        list.offerLast("Pink");
        System.out.println("After inserting at end: " + list);
    }
}

//4.Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
import java.util.*;

public class LinkedListElementPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}

//5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
import java.util.*;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Before swap: " + list);
        if (list.size() >= 3) {
            Collections.swap(list, 0, 2);
            System.out.println("After swapping first and third: " + list);
        } else {
            System.out.println("Not enough elements to swap.");
        }
    }
}

