package Nov.exe_04112024CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab192 {
    public static void main(String[] args) {
        // In case of HashMap data is stored as:-
        // name: Mehak, roll no: 7, phone:4468642452754
         Map m1 = new HashMap();
        // Map m1 = new LinkedHashMap();
        // Map m1 = new TreeMap();
         m1.put("name","Mehak"); // here we have used put to add the elements
         m1.put("roll no",7);
         m1.put("phone",956821456);
        System.out.println(m1);
    }
}
