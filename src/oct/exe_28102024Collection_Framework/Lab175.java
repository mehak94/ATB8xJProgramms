package oct.exe_28102024Collection_Framework;
import java.util.ArrayList;
import java.util.Collections;

public class Lab175 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(30);
        marks.add(45);
        marks.add(68);
        marks.add(80);
        marks.add(75);
        marks.add(78);
        System.out.println(marks);

        // Sorting
        // Collections.sort(marks);
        //Collections.sort(marks,Collections.reverseOrder());
        Collections.sort(marks);
        System.out.println(marks);
    }
}
