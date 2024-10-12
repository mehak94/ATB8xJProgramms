package oct.exe_04102024Constructors;

public class Person {
    String name;
    int age;
    int aadhar_number;
    long phone_number;
    String surname;
    int account_number;
    int eyes;
    String hair_color;
    String status;
    int legs;
    // Default Constructor
 Person(){
     System.out.println(" I am DC");
 }
 // Parameterized Constructor
 Person(String name){
     System.out.println(" I am PC");
     this.name=name;
 }
 Person( int age,int aadhar_number,int eyes){
     System.out.println("I am another type of PC");
     this.age=age;
     this.aadhar_number=aadhar_number;
     this.eyes=eyes;
 }
    void walk() {
        System.out.println("NANR");
    }
    int talk() {
        System.out.println("RTNA");
        return 10;
    }
    String sleep (String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");
        return "I am sleeping";
    }
    void eat (String name){
        System.out.println("NRWA");
        System.out.println("Eat");
    }

}
