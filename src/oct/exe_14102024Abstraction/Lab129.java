package oct.exe_14102024Abstraction;

public class Lab129 {
    public static void main(String[] args) {
        CHROMETC C = new CHROMETC();
        C.openBrowser("chrome");
        C.closeBrowser("Chrome");
        C.takeScreenshot();
        FIREFOXTC d = new FIREFOXTC();
        d.closeBrowser("Firefox");
        d.closeBrowser("Firefox");
    }
}
