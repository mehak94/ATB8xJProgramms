package sept.exe_27092024dowhileloop;
import java.util.Scanner;

public class Lab096FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz problem
        //Write a program that prints numbers from 1 to 100.(n)
    //However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        // Logic building
        // Step 1-
        // Input-> int n -> n=100 ( we will enter the input through scanner class
        // Output -> Fizz, Buzz, FizzBuzz

        // Step -> 2
        //Rough Logic
        // for -> int i = 1 to <=100(n)
        // i -> multiple of 3 -> modulus - i%3==0 -> Fizz
        // i -> multiple of 5 -> modulus - i%5==0 -> Buzz
        // i -> multiple of 3 and 5 -> modulus - i%3 && i%5 ==0 -> FizzBuzz

        // Step 3 -> Real Logic

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            if ( i%3==0 && i%5 ==0){
                System.out.println("FizzBuzz");}
            else if( i%3==0) {
                System.out.println("Fizz");}
            else if (i%5 ==0){
                System.out.println("Buzz");}
            else {
                System.out.println(i);
            }
        }

    }
}
