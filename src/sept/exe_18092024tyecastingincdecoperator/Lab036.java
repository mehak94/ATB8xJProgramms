package sept.exe_18092024tyecastingincdecoperator;

public class Lab036 {
    public static void main(String[] args) {
        //GST = 18.45;
        float GST = 18.45f;
        // int b1 = GST; narrowing with implicit typecasting invalid
        int b1 = (int)GST; // narrowing with explicit type casting data loss will occur invalid
        System.out.println(b1);
    }
}
