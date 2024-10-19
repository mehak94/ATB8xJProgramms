package oct.exe_09102024Inheritance.SingleInheritance.single.eg2;

public class Python extends Programming {
    // IS A PROGRAMMING
    // WHENEVER THERE is "is a" relationship then there is single inheritance
    Python() {
        System.out.println("DC");
    }
    void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
