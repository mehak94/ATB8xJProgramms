package oct.exe_04102024Constructors;

public class Lab115 {
    public static void main(String[] args) {
Person Mehak = new Person();
Person Parisha= new Person("Ohri");
Person Rishabh = new Person(30,123457654,2);
Person Sushma = new Person("Kohli");
Person Bharat = new Person ( 45,5648,2);
        System.out.println(Parisha.name);
        System.out.println(Mehak.age);
        System.out.println(Rishabh.eyes);
        System.out.println(Bharat.aadhar_number);

    }
}
