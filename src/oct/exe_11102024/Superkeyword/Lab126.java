package oct.exe_11102024.Superkeyword;

public class Lab126 {
    // Super keyword in Java is a reference variable that allows
    // a subclass(child class to reference the parent class).
    // 1) Use of Super with Variables.
    // 2) Use of Super with Methods.
    // 3) Use of Super with Constructors.
    public static void main(String[] args) {
        Car c = new Car();
    }}
    class Car extends Vehicle{
        private     int maxSpeed=281;
        Car(){
            super();
            System.out.println("DC Car");
            System.out.println(this.maxSpeed);
            System.out.println(super.maxSpeed);
        }
    }
    class Vehicle{
        public int maxSpeed=180;
        Vehicle(){
            System.out.println("DC Vehicle");
        }
        Vehicle(int a){
            System.out.println("PC Vehicle");
        }
        void message(){
            System.out.println("Hello Vehicle");
        }
        void message (int a){
            System.out.println("Hello Vehicle");
        }
    }

