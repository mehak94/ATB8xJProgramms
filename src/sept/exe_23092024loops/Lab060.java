package sept.exe_23092024loops;

public class Lab060 {
    public static void main(String[] args){
        // JDK>13 , they have introduce new syntax for multiple match
        int itemcode = 006;
        switch(itemcode){
            case 001,002,006:
                System.out.println("My name is Mehak");
                break;
            case 003,004,005:
                System.out.println("My name is Parisha");
                break;
            default:
                System.out.println("We are happy");
                break;

        }

        
    }
}
