package sept.exe_25092024forloop;

public class Lab090taskoffactorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
       // System.out.println(n*--n*--n*--n*--n);
        while(n>=1){
            factorial = n*factorial;
            n--;}

        System.out.println("Factorial of 5 is " + factorial );
    }}

