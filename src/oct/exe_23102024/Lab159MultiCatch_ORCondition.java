package oct.exe_23102024;

public class Lab159MultiCatch_ORCondition {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // Exception of java.lang.ArrayIndexOutOfBoundsException will come
            int a = Integer.parseInt(ip); // NumberFormatException
            int b= 100/a; // ArithmeticException
            System.out.println(b);
    }catch(ArithmeticException| NumberFormatException|ArrayIndexOutOfBoundsException e){
        // catch(Exception e) , We can also use throwable here
            // catch(Throwable e)
            System.out.println(e.getMessage());
        }
}}
// If we do not know which exception is basically comes at the run time then we use bigger basket i.e. Exception.
// Throwable class is a super class which can contains all the things.