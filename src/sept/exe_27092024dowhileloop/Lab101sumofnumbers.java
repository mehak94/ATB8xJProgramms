package sept.exe_27092024dowhileloop;

public class Lab101sumofnumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        do {
            sum+=i ;
        i++;}
        while(i<=100);
        System.out.println("Sum of 100 numbers is " + sum);
        }
    }

