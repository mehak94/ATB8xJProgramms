package oct.exe_28102024Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab174List {
    public static void main(String[] args) {

        // List is also an interface
        // We cannot create an object of interface.
        // We can do like below

        List list = List.of("banana", "apple", " grapes", "orange");
        System.out.println(list);

        //  We use "of" to create a list as it is a "static" function that can contain a full definition
        System.out.println(list.size());
        // list.add("guava"); is unsupported operation exception as of is static in nature and add is not present in list
        // this is done by child through dynamic dispatch father reference child object

        List add = new ArrayList();
        add.add("1");
        add.add("2"); // We can also add duplicates but this is the disadvantage of it.
        System.out.println(add);
        System.out.println(add.size());
        System.out.println(add.contains(1));// this is integer but list contains string
        System.out.println(add.contains("1"));
        System.out.println(add.isEmpty());
        System.out.println(add.indexOf("2"));
        System.out.println(add.lastIndexOf("2"));

        System.out.println("------ by default for loop");
        // How to iterate

        for(int i =0; i< list.size(); i++){
        System.out.println(list.get(i));
    }

        System.out.println("---- by foreach loop");

        for(Object o : list){
            System.out.println(o); // foreach loop is used only in case of collection framework and objects
            // in which o simply means print all the objects available in th elist
        }
}}
// ArrayList - Behind the scene it is growable array( dynamic array)
//Array -> 10 -> you enter the 9th item -> 20th array automatically ( it is done in ArrayList Class)
// You don't have worry about it  how it is done , we have to just use it as it is.