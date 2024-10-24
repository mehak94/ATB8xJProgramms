package oct.exe_18102024Arrays;

public class Lab143 {
    public static void main(String[] args) {
        // Strings
        // Non - Primitive datatype used to represent sequences of characters.
        // It is basically a class
        char c = 'v';
        String name = "Mehak"; // bunch of characters.
    }
}
// Immutability :- Strings in java are immutable, meaning once a string object is created , its value cannot be changed.
// Any modification results in the creation of a new string instance.
// How strings are created?
// By two methods:-
// = Operator -> String constant pool(JVM)
// e.g. :- String a = "Mehak";
// New Operator -> Heap Area -> JVM objects
// e.g.:- String name = new String ("Mehak");