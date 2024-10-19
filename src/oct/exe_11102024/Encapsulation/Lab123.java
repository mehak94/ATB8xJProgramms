package oct.exe_11102024.Encapsulation;

public class Lab123 {
    public static void main(String[] args) {
   VWOLogin vwologin = new VWOLogin( "Mehak", "password") ;
        System.out.println(vwologin.password);
        vwologin.password = "hacker";// If access modifier in class is public anyone can change the value
        System.out.println(vwologin.password);// so we have to change it to private.

        GoodVWOLogin vwo1 = new GoodVWOLogin("admin","pass");
      //  System.out.println(vwo1.password);
// In this case we are not able to access the password bec it is private in class
        // then i am not able to change the password if i want to do so then i can do only in GoodVWOLogin vincinty by
        // by using getter setter
       // System.out.println(vwo1.getPassword());
       // vwo1.setPassword ("Pass123");
        //System.out.println( vwo1. getPassword());
    // Checking admin
    boolean isadmin = true;
    vwo1.setPassword("Pass123",isadmin);
        System.out.println(vwo1.getPassword());
}}
