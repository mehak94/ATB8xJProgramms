package oct.exe_25102024Arrays;
import java.util.Arrays;
public class Lab166 {
    public static void main(String[] args) {
        // Creation of an array
        int[] marks ={ 23,34,45,6,7,78}; // fixed size array
      //  System.out.println(marks.length); // length means number of elements and counting always starts from 1
       // System.out.println(marks[0]); // 0 denotes the index( the value of array element at 0 index)
      //  System.out.println(marks[1]);
        //System.out.println(marks[6]); // this will give us ArrayIndexOutOfBox Exception as there are only 5 index
// Another way to create an array

        int[] marks2 = new int[5];
        marks2[0] = 11;
        marks2[1] = 21;
        marks2[2] = 31;
        marks2[3] = 41;
        marks2[4] = 51;
       // System.out.println(marks2[0]);
       //System.out.println(marks2[1]);
      //  System.out.println(marks2[2]);
      //  System.out.println(marks2[3]);
      //  System.out.println(marks2[4]);

        // New function of arrays which is "sort"

        Arrays.sort(marks);
       // System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);
       // System.out.println(marks[3]);
      //  System.out.println(marks[4]);

        // we can also use for loop for it

        for(int i=0; i<marks.length; i++){
          // System.out.println(marks[i]);

            // We can  do item search in sorted array only.

            int item = Arrays.binarySearch(marks,45);
           System.out.println(item);
        }
    }
}
