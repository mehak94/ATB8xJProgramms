package oct.exe_30102024Collection_Framework;

import java.util.Stack;

public class Lab181_Datatype_Stack {
    public static void main(String[] args) {
       // Stack is fall in LinkedList category.
        // Mainly we use only arraylist in web automation.
        Stack s = new Stack();
        s.add("Mehak");
        s.add("Parisha");
        s.add("Rishabh");
        System.out.println(s);// works on the principal of lifo
        System.out.println(s.pop());// pop means to take out
        System.out.println(s.peek());// peek means to see the last element
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Bittu"));
        s.add(1,"Sunita");
        s.remove(2);
    }
}
