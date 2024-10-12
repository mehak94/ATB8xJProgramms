package oct.exe_04102024Constructors;
import java.sql.SQLOutput;

public class Lab114 {
    public static void main(String[] args) {
Dog gs =  new Dog ("GS",7);
Dog bd = new Dog ("AA");
Dog bs = new Dog("PUMA",6);
        System.out.println(gs.breed);
       System.out.println(bd.breed);
        System.out.println(bs.name);
        System.out.println(bs.age);
        System.out.println(gs.name);
        System.out.println(gs.age);
    }
}
