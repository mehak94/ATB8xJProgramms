package sept.exe_23092024loops;

public class Lab061 {
    public static void main(String[] args) {
        // In JDK >13 , new thing is introduce to replace "break" keyword which is arrow (->)
        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("HELLO");
            case 002 -> System.out.println("Hii");
            case 003 -> System.out.println("How are u?");
            default -> System.out.println("Fine");
        }
    }
}
