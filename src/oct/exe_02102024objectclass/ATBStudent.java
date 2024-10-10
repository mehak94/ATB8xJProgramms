package oct.exe_02102024objectclass;

public class ATBStudent {
    public int age;
    public int rollno;
    public long phone_no;
    public String address;
    public boolean fee_paid;
    public static void main(String[] args) {
        ATBStudent Mehak = new ATBStudent();
        Mehak.age=30;
        System.out.println(Mehak);
        ATBStudent Student = new ATBStudent();
        Student.rollno= 1;
        System.out.println(Student);
        ATBStudent Contact = new ATBStudent();
        Contact.phone_no = 757656454;
        System.out.println(Contact);
        ATBStudent Area= new ATBStudent();
        Area.address = "XYZ_City";
        System.out.println(Area);
        ATBStudent Status = new ATBStudent();
        Status.fee_paid = true;
        System.out.println(Status);




    }
}
