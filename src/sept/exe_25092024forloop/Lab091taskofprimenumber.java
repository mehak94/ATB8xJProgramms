package sept.exe_25092024forloop;

public class Lab091taskofprimenumber {
    public static void main(String[] args) {
        // Prime numbers from 1 to 100 using for loop
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is Prime ");
            } else {
                System.out.println(i + " is Composite ");
            }

        }
    }
}