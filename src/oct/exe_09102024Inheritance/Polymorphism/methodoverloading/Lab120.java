package oct.exe_09102024Inheritance.Polymorphism.methodoverloading;

public class Lab120 {
    public static void main(String[] args) {
            MathOperation m = new MathOperation();
          int result=  m.add(3,4);
        System.out.println(result);
            String name = m.add("Mehak","Kohli");
        System.out.println(name);
    }
}
// we can write many more functions.
// Same arguments but different return type.
