package oct.exe_16102024Static.Block;

public class Lab139 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
        A a2; // It is not an object
    }
}
class A{
    {
        System.out.println("IIB"); // called number of times the object is created
    }
    static{
        System.out.println("SIB"); // called when class is uploaded.
    }
}

