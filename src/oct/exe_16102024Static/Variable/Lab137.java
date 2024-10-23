package oct.exe_16102024Static.Variable;

public class Lab137 {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name="XYZ";
        System.out.println(Student.school_name);
        System.out.println(s1.age);
    }
}
class Student{
    int age;// Instance variable(Non- Static)
    static String school_name = "ABC";// sTATIC VARIABLE

    public Student(int age){// Constructor
        this.age=age;
    }
}