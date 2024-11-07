package Nov.exe_04112024_Genrics;

public class Lab197 {
    public static void main(String[] args) {
printTs(1,"Mehak",true);
    }
    public static <T1,T2,T3> void printTs( T1 a, T2 b, T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
