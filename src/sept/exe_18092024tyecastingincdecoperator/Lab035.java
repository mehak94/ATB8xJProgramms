package sept.exe_18092024tyecastingincdecoperator;

public class Lab035 {
    public static void main(String[] args) {
        long phone_no = 9854621548l;
       // short s = phone_no; // Narrowing - Implicit - JVM // invalid
        short s = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
        System.out.println(s);

    }
}
