package oct.exe_25102024Arrays;
import java.util.Scanner;
public class Task_Pyramind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=1; i<=n; i+=2){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
