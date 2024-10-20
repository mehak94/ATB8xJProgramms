package oct.exe_11102024.Task;

public class TestCase extends Basetest{
    TestCase()
    {
        super(); // calling parent constructors and methods, // DC of parent.
        this.setName("Mehak", true); // calling the method of child using this operator
        System.out.println("Name is printed");
        this.performDelete("Mehak");
        System.out.println("Deleted");

    }
    //Method overriding
    @Override
    public void setName(String name, boolean auth) {
        super.setName(name,auth);
    }
    @Override   public void setId(int id) {
        super.setId(id);

    }
    // Method Overloading
    public void performDelete(String name)
    {
        System.out.println(" Delete-Delete the data of user " +name);
    }


}

