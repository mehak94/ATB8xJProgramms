package oct.exe_18102024Arrays;
// Palindrome
public class Task2 {
    public static void main(String[] args) {
        String str = "abba";
        String st = "Pramod";
        String name="";
        //for(int i = str.length()-1; i>=0;i--){
        for(int i= st.length()-1;i>=0; i--){
        name= name+ st.charAt(i)  ;
        }
//System.out.println("yes");
        System.out.println("No");
    }
}
