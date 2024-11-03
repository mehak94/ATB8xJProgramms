package oct.exe_28102024Collection_Framework;
import java.util.ArrayList;

public class Lab173Array_List {
    public static void main(String[] args) {

        // Collection - Interface
        // List - Interface
        // List includes :- Arraylist, LinkedList, Stack and Vector class.
        // In list duplicate is allowed. and null is also allowed
        // In list we can store different types of data type as well.
        // e.g.:-

        ArrayList studentList = new ArrayList();
        studentList.add("Mehak"); // String
        studentList.add("123"); // Integer
        studentList.add("true"); // Boolean
        studentList.add("null"); // Null

        // Different types of data.
        System.out.println(studentList);

        // We cannot do same thing with arrays bec of fixed size and same datatype
        // so we can say that arraylist is upgraded versio of array.
    }
}
