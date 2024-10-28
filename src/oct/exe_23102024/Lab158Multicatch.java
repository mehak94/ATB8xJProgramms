package oct.exe_23102024;

public class Lab158Multicatch {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // Exception of java.lang.ArrayIndexOutOfBoundsException will come
            int a = Integer.parseInt(ip); // NumberFormatException
            int b= 100/a; // ArithmeticException
            System.out.println(b);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}
