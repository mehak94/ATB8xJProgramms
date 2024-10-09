package oct.exe_02102024objectclass;

public class ATBStudent {
    public int age;
    public int rollno;
    public static void main(String[] args) {
        ATBStudent Mehak = new ATBStudent();
        Mehak.age=30;
        System.out.println(Mehak);
        ATBStudent Student = new ATBStudent();
        Student.rollno= 1;
        System.out.println(Student);


    }
}
