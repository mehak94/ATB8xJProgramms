package sept.exe_20092024ternaryoperatorandconditions;

public class Lab057 {
    public static void main(String[] args) {
        //Types of triangle
        int side1 = 10;
        int side2 = 12;
        int side3 = 15;
        if ( side1 == side2 && side2 == side3 && side3 == side1 )
        {
            System.out.println("Equilateral"); }
        else if ( side1 == side2 || side2 == side3 || side3 == side1 ){
            System.out.println("isosceles"); }
        else {
            System.out.println("Scalene"); }
        }

    }

