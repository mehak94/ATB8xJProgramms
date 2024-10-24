package oct.exe_18102024Arrays;
// String equals
public class Lab145 {
    public static void main(String[] args) {
        String s1 = "Hello"; // String literal  and created in SCP
        String s4 = "Hello";
        String s2 = new String (" Hello");// Object area
        String s3 = new String (" Hello");// always new memory location
        String s5 = new String("hello");
        System.out.println(s1==s2);// False as they have different memory locations
        System.out.println(s2==s3);// false
        System.out.println(s1 == s4);// true
        // In case of string == checks the memory allocations where as in case of integer it checks the integers.
        // How to check the values? equals== value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }// equals can check the value.
}
