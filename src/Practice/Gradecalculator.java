package Practice;
import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks n");
        int n = sc.nextInt();
        if( n<0 || n>100){
            System.out.println("Are you mad");}
            if( n>=90 && n<=100){
                System.out.println(" Grade is A");}
                else if(n>=80&& n<=90){
                    System.out.println("Grade is B");}
                else if(n>=70&&n<=80){
                System.out.println("Grade is C");}
            else if(n>=60&&n<=70){
                System.out.println("Grade is D");}
            else
                System.out.println("Invalid input");
                }
            }




