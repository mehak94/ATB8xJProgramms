package oct.exe_30102024Collection_Framework;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class Lab180_LinkedList {
    public static void main(String[] args) {
        // Linkedlists

      LinkedList mylists = new LinkedList();
       // List mylists = new LinkedList(); // Dynamic dispatch
        mylists.add(1);
        mylists.add(2);
        mylists.add(3);
        mylists.add(4);
        System.out.println(mylists);

        // In Selenium autmomation or in API automation if i want to do lot of insertion , deletion then we use linkedlists
        // in API testing i want to only store the elements and access the elements then we will use arraylists.
        // Doubly LinkedList means we can have two references who is at front and behind.
    }
}
