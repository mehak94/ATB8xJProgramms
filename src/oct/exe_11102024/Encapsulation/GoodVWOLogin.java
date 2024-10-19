package oct.exe_11102024.Encapsulation;

public class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String username,String password) {
        this.username = username;
        this.password = password;
    }
// We will use the getter and setter to get and set the values
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password, boolean isadmin) {
        // if i hide this function then we are not allowed to set the password.
        if (isadmin){
            this.password = password;}
            else{
                System.out.println("Not allowed");
            }
        }


    }



