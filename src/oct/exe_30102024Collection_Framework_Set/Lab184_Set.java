package oct.exe_30102024Collection_Framework_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab184_Set {
    public static void main(String[] args) {
        // In Set duplicates are not allowed but in List duplicates are not allowed.
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
        hs.add("Mehak");
        hs.add("mehak");
        hs.add("Mehak");// duplicates are not allowed in Set so mehak will be printed only one time.
    }
}
