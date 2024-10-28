package oct.exe_23102024.CustomException;

import java.sql.SQLOutput;

public class Lab162 {
    public static void main(String[] args) {
        Lab161Bank sbi = new Lab161Bank ("INR", 100);
        Lab161Bank icici = new Lab161Bank ("INR", 123);
        Lab161Bank jp_chase = new Lab161Bank("USD",100);
       // System.out.println(sbi.add(icici));
       // System.out.println(sbi.add(jp_chase)); // Here is the exception as both the currencies are different so we need to add a check inthis case.
    }
}
