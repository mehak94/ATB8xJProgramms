package oct.exe_18102024Arrays;

public class Lab148StringBuilder_StringBuffer {
    public static void main(String[] args) {
        //String name= "Mehak";
        // name = "Kohli";
        // The above are two different strings.

        // final class StringBuffer
        // String Buffer will not create the new string , it changed the original string.(i.e. mutable)
        // It is threadsafe

        StringBuffer str = new StringBuffer("Mehak");
        str.append(" Kohli");
        System.out.println(str);

        // StringBuilder
        // It is also mutable in nature.
        // But is not threadsafe like StringBuffer.

        // Appending to sTRINGbUILDER

        StringBuilder sb = new StringBuilder("HELLO");
        sb.append("World");
        System.out.println(sb);

        // Inserting into StringBuilder
        sb.insert (5,  ",");
        System.out.println(sb);

        // Deleting from StringBuilder
        sb.delete(5,6);
        System.out.println(sb);

        // Reversing StringBuilder
        sb.reverse();
        System.out.println(sb);
    }
}
