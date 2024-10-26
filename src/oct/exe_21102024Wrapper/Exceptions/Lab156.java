package oct.exe_21102024Wrapper.Exceptions;

public class Lab156 {
    public static void main(String[] args) {
        //  How to handle the exception
        // By using try and catch

        int c = 0;
        try {
                int  e = 10/c;
                System.out.println(e); //Select these two lines then click surround there select the option of try and catch
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        System.out.println("End of the program");
}}
// Multiple catch is allowed in this.
// Combining multiple catch is also allowed
// Multiple try and catch is also possible.