package sept.exe_27092024dowhileloop;
import java.util.Scanner;

public class Lab098triangleclassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the length of first side");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second side");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of third side");
        int side3 = sc. nextInt();
        if(side1 >= 1 && side2>=1 && side3>=1) {
            if (side1 == side2 && side2 == side3 && side3 == side1)
                System.out.println("Equilateral");
            else if (side1 == side2 || side2 == side3 || side3 == side1)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
        else System.out.println("Are you Mad");




    }
}
