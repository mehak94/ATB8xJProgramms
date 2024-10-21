package oct.exe_14102024Abstraction;

public class BaseClass extends Grandbaseclass {
    // Web Automation
    // Single
    // Hide the functionality of the open and close Browser.
    void openBrowser(String browser){}
    void closeBrowser(String browser){}
    @Override
    void takeScreenshot(){
        System.out.println(" Taking Screenshot");
    }

}
