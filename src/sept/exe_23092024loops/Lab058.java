package sept.exe_23092024loops;

public class Lab058 {
    public static void main(String[] args) {
        // Grade calculator
        int score = 56;
        if (score >= 90 && score <= 100)
         {
            System.out.println("A");
        } else if (score >= 70 && score <= 80)
        {
            System.out.println("B");}
        else if (score >= 60 && score <= 70)
        {
            System.out.println("C");}
        else if (score >= 50 && score <= 60)
        {
            System.out.println("D");}
        else if (score >= 40 && score <= 50)
        {
            System.out.println("E");}
        else if (score >= 30 && score <= 40)
        {
            System.out.println("F");}
        else {
            System.out.println("Fail");}

    }
}
