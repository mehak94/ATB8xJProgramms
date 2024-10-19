package oct.exe_11102024.Encapsulation;

public class Lab124 {
    public static void main(String[] args) {
ICICI amit = new ICICI(100,"Amit");
        System.out.println(amit.getBalance());
        System.out.println(amit.getName());
        boolean are_you_admin= true;
        ICICI admin = new ICICI(200,"Amit");
        admin.setBalance(200,true);
        System.out.println(admin.getBalance());
    }
}
