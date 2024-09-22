package sept.exe_20092024ternaryoperatorandconditions;

import java.sql.SQLOutput;

public class Lab047 {
    public static void main(String[] args) {
        int score = 85;
       // To print the grade of a child
        String Grade = (score>= 90) ? "A" : (score>=80)? " B" : (score>=70)? "C" : "D";
        System.out.println(Grade);
    }
}
