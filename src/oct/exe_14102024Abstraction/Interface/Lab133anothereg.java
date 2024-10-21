package oct.exe_14102024Abstraction.Interface;

public class Lab133anothereg {
    public static void main(String[] args) {
ABC abc = new ABC ();
abc.f1();
    }
}
class ABC implements I1 {
    @Override
    public void f1(){
    }
    @Override
    public void f2(){

    }
}
interface I1{
    void f1();
    void f2();
}