package oct.exe_21102024Wrapper.Exceptions;

public class Lab153 {
    public static void main(String[] args) {
// An exception ia an event that occurs during the execution of a program that disrupts the normal flow of instructions.
        // Exceptions can be handled in Java by using 1) Try and catch block 2) Throws
        System.out.println("Start of the program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println("End of the program");
    }
}
// JVM will be initialised(from RAM)
// Creates and start the main thread - main called
// 1) Collects the command line arguments - 10
// String[]args = {10}
// 2) Lab 170 Exception.main()
// Now control will be transferred from the main thread to main method.
//When problem comes in main JVM will handle it.
// If we donot handle the exception JVM will handle it.
// Always terminate the program.
// Error :- Event in the program that disrupts the normal flow , they cannot be handled in Java. e.g. :- Memory Overflow.
// Exceptions are of two types:- 1) Checked exception which is known by JVM.
// 2) Unchecked exception which is not known by JVM.