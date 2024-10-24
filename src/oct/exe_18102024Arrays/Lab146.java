package oct.exe_18102024Arrays;

import org.w3c.dom.ls.LSOutput;

//String functions
// Type javap java.lang.String type this command in CMD to get all the functions.
public class Lab146 {
    public static void main(String[] args) {
String str = " Hello World ";
    // length of the string, spaces will also be counted
        System.out.println("Length:" +str.length());

        // Substring:- To find the part of string
        System.out.println("Substring:"+str.substring(1,5));

        // Trim:- It will clear the space from begining and end
        System.out.println("Trimmed: ' " +  str.trim()+"'");

        // Convert to upper case and lowercase
        System.out.println("Uppercase:"+ str.toUpperCase());
        System.out.println("Lowercase:" + str.toLowerCase());

        // To find the character
        System.out.println(str.charAt(2));

        // To find equals
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(""));

       // CompareTo function to compare two values, it actually returns the difference

        String name = "Mehak";
        String name1 = "Mehak";
        System.out.println(name.compareTo(name1)); // output is zero if both are same if they are not same
        // then it returns the difference between ascii values of two characters (lexicographically comparison)

        // strip function :- Almost similar to Trim.


    }
}
