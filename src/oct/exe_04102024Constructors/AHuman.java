package oct.exe_04102024Constructors;

public class AHuman {
        // Creating a new  class (planet) Ahuman by using  oops.
        String eyes_colour;
        String planet = "AHuman";
        String name;
        long aadhar_card_number;
        // Default constructor
        AHuman(){
            System.out.println("I will be called when object is created");
            // Advantage:- I can write a code here which will automatically executed when object is created.
            // e.g. :- I can write a code to read a file.
        }
        // We can create one more constructor i.e.
    // Parameterized Constructor
    AHuman(String name){
        System.out.println("Hi, I am Parameterized Constructor");
        this.name=name;
    }
        void walk() {
            System.out.println("NRNA");
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


