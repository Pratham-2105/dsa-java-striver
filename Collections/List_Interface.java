package Collections;

//import java.util.Collections; // For using interface Collection;
//import java.util.List; // For using interface List;
import java.util.*; // Imports all the utilities;

public class List_Interface {
    public static void main(String[] args) {
        // *** ARRAY_LIST ***

        ArrayList<Integer> aList = new ArrayList<>(); // empty-list with capacity ten
        int arr[] = new int[100];

        aList.add(10);
        aList.add(16);
        aList.add(21);
        aList.add(12);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(2)); // returns the value at index
        System.out.println(aList.remove(1)); // removes & returns the value at index
        aList.add(0, 22);
        System.out.println(aList);
        System.out.println(aList.contains(21));

        // *** LINKED_LISTS ***

        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(11);
        LL.add(21);
        LL.addFirst(31);
        LL.addLast(79);
        System.out.println(LL);
        LL.removeFirst();
        LL.removeLast();
        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println(LL.getLast());

        // *** STACK *** --> LastInFirstOut; LIFO

        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(4);
        stack.push(19);
        System.out.println(stack);
        System.out.println(stack.peek()); // Last Element;
        stack.pop(); // Removes the last element;
        System.out.println(stack);

        // *** VECTOR *** --> Thread Safe;
        // Vector<Integer> vec = new Vector<>();
    }
}