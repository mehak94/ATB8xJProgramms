package oct.exe_04102024Constructors;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    Dog() {
        System.out.println("I am DC");
        System.out.println("God is happy");
    }

    Dog(String breed) {
        System.out.println("I am PC");
        this.breed= breed;
    }

   Dog(String name, int age){
      System.out.println("I am PC");
       this.name= name;
       this.age=age;
   }


void walk(){


    }

}
