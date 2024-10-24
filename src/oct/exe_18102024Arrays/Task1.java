package oct.exe_18102024Arrays;
// Reverse the string using for loop
public class Task1 {
    public static void main(String[] args) {
        String name = "Mehak";
        String st = "";
        for (int i = name.length()-1; i >= 0; i--) {

            st = st + name.charAt(i);
        }
        System.out.println(st);
    }
}
