package Nov.exe_04112024CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab194_real_ex {
    public static void main(String[] args) {
        HashMap<String,String>student1 = new HashMap();
        student1.put("name","Mehak");
        student1.put("rollno","1");
        student1.put("phone","98547623");
        System.out.println(student1);

        HashMap<String,String>student2 = new HashMap();
        student2.put("name","Mehar");
        student2.put("rollno","2");
        student2.put("phone","98547624");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
