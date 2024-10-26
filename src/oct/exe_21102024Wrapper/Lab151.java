package oct.exe_21102024Wrapper;
// Real use of wrapper class is to convert non-primitive data type to primitive
// it follows three steps :- 1) convert non-primitive data type to wrapper class. 2) then to primitive. 3) or directly
// we can convert without first converting to wrapper class by using a function parseInt().
public class Lab151 {
    public static void main(String[] args) {
String num = "10";
Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a;// Unboxing
        // String to primitive directly
        int a3 = Integer.parseInt(num);
        System.out.println(a3);
    }
}
