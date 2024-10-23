package oct.exe_16102024Static.Block;

public class Lab140 {
    public static void main(String[] args) {
ATB s1 = new ATB("Mehak");
ATB s2 = new ATB("Rishabh");
ATB s3 = new ATB("Parisha");
        System.out.println(s1.getName());

    }
}
class ATB{
    {
        System.out.println("IIB");
        // What is the purpose?-
        // Here you can write the code related to?
        // Start a website or anything before starting the
        // web automation or API automation.
        System.out.println("Reading the CSV file");
    }
    static{
        System.out.println("Load the class?, I will execute");
    }

private String name;
    private long phonenumber;
    static String coursename = "ATB8X";

    public String getName() { // getter and setter for name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  ATB(String name){  // Parameterized constructor
    this.name= name;
    }
void readDocuments(){
    System.out.println("Non_ Static method");
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }

}
// Static functions cannot have instance variable in them.
// Non- Static functions can have static variables in it bec already the class is loaded.