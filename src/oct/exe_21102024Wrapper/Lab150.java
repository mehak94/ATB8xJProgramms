package oct.exe_21102024Wrapper;

import java.sql.SQLOutput;

// Wrapper means adding a wrapper of class
public class Lab150 {
    public static void main(String[] args) {
// To convert primitive datatype into a Wrapper class
        int a =10;
        Integer b = a;
        System.out.println(b);
        // Advantage of converting primitive into wrapper is that the class is created and we can do b.
       // System.out.println(b.); Any function we can add
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer a2 = 42; // Autoboxing
        int value = a2; // Unboxing
        System.out.println(value);
    }
}
// max_value and min_value are static in nature bec we use them without creating an object.