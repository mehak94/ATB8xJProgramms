package oct.exe_11102024.Task;

public class Basetest {
    // Encapsulation
   private String name;
   private int id;
    void BasetestAPI(){
       System.out.println("DC of base class");
   }
    public void performGet()
    {
        System.out.println(" Get- to fetch the data");
    }
    public void performPost()
    {
        System.out.println(" Post- to create new data");
    }
    public void performPatch()
    {
        System.out.println(" Patch- to edit the existing  data");
    }  public void performPut()
    {
        System.out.println(" Put- to update the existing  data");
    }
    public void performDelete()
    {
        System.out.println(" Delete-Delete the data");
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isadmin) {
        if(isadmin){
            System.out.println("allowed");
        this.name = name;}
        else{
            System.out.println("not allowed");
        }
    }
}
