package oct.exe_23102024.CustomException;
import java.io.File;
import  java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab163Throws {
    public static void main(String[] args) {
       // extracted();
    }
    private static void extracted() throws FileNotFoundException{
        FileInputStream f= new FileInputStream("fgfdgf");
    }
} // throws means main method is declaring the exception.
// read difference bw throw and throws from notes.
