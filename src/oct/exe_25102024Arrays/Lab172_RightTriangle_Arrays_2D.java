package oct.exe_25102024Arrays;
import java.util.Scanner;
public class Lab172_RightTriangle_Arrays_2D{
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
     for(int i = 0; i<n; i++){
       for( int j =0; j<=i;j++){
           System.out.print("*");
       }
         System.out.println();
     }
    }
}
