package sept.exe_20092024ternaryoperatorandconditions;

public class Lab048 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
        int max = ( a>b)? b : (b<c)?c:a;
        System.out.println(max);
    }
}
