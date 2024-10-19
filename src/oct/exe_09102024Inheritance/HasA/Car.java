package oct.exe_09102024Inheritance.HasA;

public class Car {
   // Has a relationship isalso known as Aggregation concept
    //A car  "Has A" Engine, Tyre
     void startCar(){
        new Engine().start(); // in case of has a we create inhanses
        new Tyre().rolling();
    }

}
// In "Is A " relationship we simply use inheritance i.e. we use extend keyword
// Is A concept is also called composite concept