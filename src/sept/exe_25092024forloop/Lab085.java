package sept.exe_25092024forloop;

public class Lab085 {
    public static void main(String[] args) {
        // continue keyword, we can also use in for loop
        // continue keyword means do nothing and go to next iteration (skip it)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if ( i==5){
                continue;} // if we use break loop will stop at 5 means at 5 output will stop and incase of continue after 5 'after' will not print it will directly print
            // 6 and then ' after' will print
            System.out.println("after");
            }

        }
    }

