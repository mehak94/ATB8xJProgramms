package oct.exe_11102024.accessmodifier.police;

public class Cop {
    private int gun;
   private String idCard;
    public Cop(int gun){
        this.gun=gun;
    }
    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
