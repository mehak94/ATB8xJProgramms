package oct.exe_25102024Arrays;
import java.util.Scanner;
public class Task_LeftTriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = n;i>0;i--){
            for ( int j =i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
