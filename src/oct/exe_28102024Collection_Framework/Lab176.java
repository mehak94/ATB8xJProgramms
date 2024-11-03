package oct.exe_28102024Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab176 {
    public static void main(String[] args) {
        // Interview question

        // We can also fix the datatype by using wrapper class only bec collection framework supports them only.

        // List<int> l = new ArrayList();

        List<Integer> l = new ArrayList();
        l.add(123);

        List<String>names = new ArrayList();
        names.add("Mehak");
        System.out.println(l);
        System.out.println(names);
    }
}
