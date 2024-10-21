package oct.exe_14102024Abstraction.Interface;

public class Lab134 {
    // Default methods in interface, are those methods that can have a body.
    // without default method we cannot have a body.
    interface I3{
        default void start(){
            System.out.println("Body! DM");
        }
        void stop();
        void car();
        static void ss (){
            System.out.println("Static can also have body in interface");
        }
    }
    abstract class AA{
        void f1(){
            System.out.println("Concrete method");
        }
        abstract void f2();// In abstract class both are possible but in interface it is possible only by using default.
   static void f4(){
       System.out.println("Yes");
   }
   // We can use abstarct or interface to hide the functionality.
    }
}
