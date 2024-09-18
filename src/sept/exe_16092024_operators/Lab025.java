package sept.exe_16092024_operators;

public class Lab025 {
    public static void main(String[] args) {
        String firstname = " Mehak";
        String lastname = " Kohli";
        System.out.println(firstname + lastname); // in case of string + is concatenation operator
        //in maths ( int) it is addition operator
        int a = 10;
        int b = 10;
        System.out.println(firstname + lastname + a+b);
        System.out.println( a+b + firstname + lastname);
// string +  integer (mathematics is  not done concatenation will be done in this case)
        // integer + string ( now it will do calculation)
        System.out.println(firstname + lastname +(a+b));
    }
}
