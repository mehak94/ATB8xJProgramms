package sept.exe_18092024tyecastingincdecoperator;

public class Lab034 {
    public static void main(String[] args) {
        //Type Casting
        //Widening - Implicit, Explicit - Loseless
        // Narrowing - Implicit,Explicit( with data type),loss
        // Widening- automatically bigger basket is used , JVM has done this no need to mention in it
        //eg
        byte b = 10;
        int a = b; // valid - implicit casting - JVM
        int a1 = (int)b; // valid- explicit casting -JVM

        // Narrowing
        int val = 200; // it will first converted to 32 bits
      //  byte b1 = val; // invalid implicit casting- JVM will not accept it
        byte b2 = (byte)val; // invalid explicit casting - loss of data , then take the last 8 bits of byte the ans will be 44
        System.out.println(val);
        System.out.println(b2);
    }
}
