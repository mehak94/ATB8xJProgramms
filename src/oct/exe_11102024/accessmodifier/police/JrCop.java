package oct.exe_11102024.accessmodifier.police;

public class JrCop {
    public static void main(String[] args) {
Cop jrCop = new Cop(20);
        //System.out.println(jrCop.gun);
        // Cannot able to access the gun as it is private  but able to shoot as it is protected
        jrCop.canIShoot();
    }
}
