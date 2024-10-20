package oct.exe_11102024.Task;

import java.sql.SQLOutput;

public class APIautomation {
    public static void main(String[] args) {
        Basetest obj=new TestCase(); // Dynamic Dispatch
        obj.setId(10);
        System.out.println(obj.getId());
        obj.setName("Mehak",true);
        System.out.println(obj.getName());
    }
}
