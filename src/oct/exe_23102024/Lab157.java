package oct.exe_23102024;

public class Lab157 {
    public static void main(String[] args) {
        //Exception handling by using try and catch and finally
        int a= 0;
        try {
            int b= 10/a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
