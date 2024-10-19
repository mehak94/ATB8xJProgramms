package oct.exe_09102024Inheritance.SingleInheritance.single.real;

public class Testcase extends Basetest {
    void testcase(){
        startBrowser();
        // Write code here for test case
        readExcelFile();
        closeBrowser(); // Base cannot use it
    }

}
