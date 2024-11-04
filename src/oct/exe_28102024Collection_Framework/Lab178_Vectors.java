package oct.exe_28102024Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab178_Vectors {
    public static void main(String[] args) {
List mylist1 = new ArrayList(5);
mylist1.add("Mehak");
mylist1.add("Parisha");
mylist1.add("Rishabh");
mylist1.add("Sushma");
mylist1.add("Bushan");
mylist1.add("Bittu");
        System.out.println(mylist1);
    }
}
// only problem with vector is:-
// It is thread safe, Synchronised but arraylist is not thatswhy we prefer to use it.
// It will be time consuming
// one by one usage
// slower
// we use thread safe concept in web automation only.
// all the functions are same as arraylist