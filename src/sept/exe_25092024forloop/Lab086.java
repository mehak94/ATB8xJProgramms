package sept.exe_25092024forloop;

public class Lab086 {
    public static void main(String[] args) {
        // print the values of odd numbers from 0 to 50
        for ( int i = 0; i<=50; i++){
            if(i%2==0) {
                System.out.println("even -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
