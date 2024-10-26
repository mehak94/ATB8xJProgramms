package oct.exe_21102024Wrapper.Exceptions;

public class Lab154 {
    public static void main(String[] args) {
        // Checked Exception
        // JVM knows this
        // Suppose i want to read  a file as follows
       // FileInputStream filee = new FileInputStream("C://a.txt");
        // JVM knows that the file maynot exists.

        // Unchecked Exception
        // Arithmetic type exception, does not know by JVM we come to know about it only at the runtime.

        int a = 10;
        int c = a/0;
        System.out.println(c);

    }
}
