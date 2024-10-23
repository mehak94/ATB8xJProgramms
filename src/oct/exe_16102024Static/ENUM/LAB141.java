package oct.exe_16102024Static.ENUM;

public class LAB141 {
    public static void main(String[] args) {
        // Enum is a short form for enumerations , and are special type of data type in java.
        // allows us to define a collection of named constants.
        // Enum constants are implicity public, static and final. This means they cannot be changed once defined.
        // How to use enum:-
        System.out.println(Day.Monday);
    }
}
enum Day{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
