package oct.exe_28102024Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab177Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Mehak");
mylist.add("Rishabh");
mylist.add("PARISHA");

// fOLLOWING ARE THE THREE METHODS TO ITERATE THE LIST

        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
// Using foreach loop

        for(String str : mylist){
            System.out.println(str);
        }
// Using iterator

        Iterator<String>iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}// Iterator is used in all.