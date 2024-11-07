package Nov.exe_04112024_Genrics;

public class Lab196_Generics {
    public static void main(String[] args) {
     // Generics means common to all.
     // Generics allow the reusability of code where one single method can be used for different data_types of variables or objects.
     // Idea is to allow different types like Integer, String ,... etc and user_defined types to be a parameter to methods , classes and interfaces.
    temp(12);
    temp(true);
    temp("Mehak");
    // T :- is a reference ,it can be anything

    }

    public static<T> void temp(T a){ // here if we change T toany datatype then we will be restricted to that only
        System.out.println(a);
    }
}
