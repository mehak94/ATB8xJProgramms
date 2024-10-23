package oct.exe_16102024Static.ENUM;
// Good example of enum
import java.util.Scanner;
public class Lab142 {
    public static void main(String[] args) {
        System.out.println(color.Green.gethexcode());
        System.out.println(color.Blue.gethexcode());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexcode");
        String hexcode = sc.nextLine();
        if(hexcode == "#FF0000"){ // if(color.Green.gethexcode()
            System.out.println("color is red");
        }else{
            System.out.println("Color is not identified");
        }
    }
        enum color{
            Red("#FF0000"),
            Green("#61FF33"),
            Blue("#3377FF");
            private String hexcode;
             color (String hexcode){// Constructor
                this.hexcode=hexcode;
            }
            private String gethexcode(){
                return this.hexcode;
            }
        }
    }

