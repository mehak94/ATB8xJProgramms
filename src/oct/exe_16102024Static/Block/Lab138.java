package oct.exe_16102024Static.Block;

public class Lab138 {
    public static void main(String[] args) {
        Lab138 s1 = new Lab138();
        Lab138 s2 = new Lab138();
    }
    // IIB:- Instance initialisation block.
   // SIB:- Static initialisation block.
    // IIB is created as follows:- // It is called the number of times the object is created.
    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when object is created");
        System.out.println("Read my SQL db()");
    }
    static{
        System.out.println("SIB");
        System.out.println("Loaded once when class is loaded");
    }
}
