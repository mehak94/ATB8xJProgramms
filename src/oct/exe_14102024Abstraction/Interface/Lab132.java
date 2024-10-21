package oct.exe_14102024Abstraction.Interface;

public class Lab132 {
    public static void main(String[] args) {
    P p = new P();
    p.f1();
}
}
 class P implements I {
    @Override
        public void f1(){ // we have to complete this function , this completion is done by P
        System.out.println(" Created P");}
        @Override
                public void f2(){
            System.out.println("dgf");
        }
        public void f3(){
            System.out.println("dhf");
        }
    }

 interface I{
    void f1();// automatically it is incomplete function
  void f2();
  void f3();
// we can create as many functions as we can
}

