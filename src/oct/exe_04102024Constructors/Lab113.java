package oct.exe_04102024Constructors;

import java.sql.SQLOutput;

public class Lab113 {
    public static void main(String[] args) {
       AHuman Mehak = new AHuman();
       AHuman Parisha = new AHuman(" Mehak");
       AHuman Vijay = new AHuman("  Vijay");
       new AHuman();
       //Mehak.name= "Kohli"; We are not allowed to do this , we can set the value by creating the object and parameterized constructor.
       //Parisha.name="Ohri";
        System.out.println(Mehak.planet);
        System.out.println(Parisha.planet);
        System.out.println(Mehak.name);
        System.out.println(Parisha.name);
        System.out.println(Vijay.name);
    }
}
