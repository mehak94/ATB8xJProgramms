package sept.exe_23092024loops;

public class Lab063 {
    public static void main(String[] args) {
       int a =11; // This is given just to confuse us
       switch (-1) { // -1 will match with the case -1 so output will be 10
           default :
               System.out.println("Default");
               break;
           case -1:
               System.out.println("10");
               break;
           case 9:
               System.out.println("28");
               break;
       }
    }
}
