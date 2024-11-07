package oct.exe_30102024Collection_Framework_Set;

import java.util.*;

// Functions are same like isempty, contains, size , etc.
public class Lab185_Difference {
    public static void main(String[] args) {
        // HashSet
        Set hs = new HashSet();// Hashing mechanism is used to store the elements, no order of elements
        hs.add("Apple");
        hs.add("Apricot");
        hs.add("Anjeer");
        hs.add("null");
        hs.add("Aam");
        hs.add("Apple");
        System.out.println(hs);
        // LinkedHashSet
        Set lhs = new LinkedHashSet();// LinkedList mechanism to store the elements, order is maintained in this case.
        lhs.add("Apple");
        lhs.add("Apricot");
        lhs.add("Anjeer");
        lhs.add("null");
        lhs.add("Aam");
        lhs.add("Apple");
        System.out.println(lhs);
        // TreeSet
        Set ts = new TreeSet();// Black and Red Tree mechanism to store the elements, order is maintained in this case.
        ts.add("Dapple");// aLSO NATURAL SORTING WILL BE DONE
        ts.add("Apricot");// Red and black tree means left hand size  should be less than parent and right side should be greater than parent
        ts.add("Manjeer");
     //   ts.add("null"); we cannot add null in TreeSet
        ts.add("Pam");
        ts.add("Apple");
        System.out.println(ts);
        // We can iterate the elements as below

       for(Object o : ts){
           System.out.println(o);
       }

        Iterator it = ts.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
