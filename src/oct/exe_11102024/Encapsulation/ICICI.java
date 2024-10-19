package oct.exe_11102024.Encapsulation;

public class ICICI {
    private String name;
    private long balance;

    public ICICI(long balance,String name) {
        this.balance = balance;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isadmin) {
        if(isadmin){
        this.balance = balance;
            System.out.println("Allowed");
    }else{
            System.out.println("NOT ALLOWED");
        }}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
