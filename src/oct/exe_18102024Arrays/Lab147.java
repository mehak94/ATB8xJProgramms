package oct.exe_18102024Arrays;
// e.g. to show strings are immutable in nature.
public class Lab147 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str = str1.concat("World");
        System.out.println(str1);
        System.out.println(str);
    }
}
