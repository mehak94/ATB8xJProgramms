package oct.exe_30102024Collection_Framework;

import java.util.ArrayList;
import java.util.List;
// This is how we can store the arrayList
// In List duplicates are allowed.
public class Lab183_List {
    public static void main(String[] args) {
Student s1 = new Student("Amit",1);
        Student s2 = new Student("Ajay",2);
        Student s3 = new Student("Abhay",3);
        Student s4 = new Student("Anil",4);
        List<Student> mystudents = new ArrayList<>(); // This is how we can add elements in arraylist
        // We can add elements as below.
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);
        mystudents.add(s4);
        // We can print the details in following two methods
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s3.printDetails());
        System.out.println(s4.printDetails());
        // 2nd method
        System.out.println(mystudents);
    }
}
class Student{
    String  name;
    Integer rollno;

    public Student(String name, Integer rollno) {
        this.name = name;
    this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }
    // If we want to use the function printdetails
    public String printDetails(){
        return"Student{" +"name='" + name +'\''+",rollno="+rollno+'}';
    }
    @Override
    public String toString(){ // toString method of objects, it is basically used to print the details directly
        return "Student{"+"name='" + name +'\''+",rollno="+rollno+'}';
    }
}