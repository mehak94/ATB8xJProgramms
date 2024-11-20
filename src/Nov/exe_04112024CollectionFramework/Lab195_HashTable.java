package Nov.exe_04112024CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab195_HashTable {
    public static void main(String[] args) {
      // HashTable is similar to HashMap in which 1 null key is allowed.
        // Difference between them it is synchronised(thread safe) in nature, slow and Legacy class
        // and it doesnot allow null key and null values.
        // To iterate Legacy class we use enumaration

        Hashtable<Integer, String> ht = new Hashtable();
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        System.out.println(ht);

        // to iterate it we will use " enumeration" as it is legacy class

        Enumeration<Integer> e = ht.keys();
        while(e.hasMoreElements()){
           // System.out.println(e.nextElement()); // to get the keys
            System.out.println(ht.get(e.nextElement()));// to get the values
        }
    }
}
