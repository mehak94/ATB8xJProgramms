package oct.exe_11102024.Encapsulation;

public class VWOLogin {
     String username; // By default access modifier is public
    String password;// To hide the data  it should be private
    public VWOLogin(String username, String password){
        this.username= username;
        this.password= password;
    }
}
