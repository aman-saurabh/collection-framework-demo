  package com.techpassel.list;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Stack is a child class of Vector hence all methods applicable for Vectors are applicable for Stacks also.
        Stack<String> s = new Stack<>();
        s.add("Aman");
        s.add(1,"Geetika");
        s.addElement("Saurabh");
        //To show how to use addAll() method or how to add all elements of a collection object in a stack.
        LinkedList<String> l = new LinkedList<>();
        l.add("Mohit");
        l.add("Swati");
        l.add("Anna");
        s.addAll(l);

        //Stack specific methods to add elements.
        s.push("Samir");
        //push() method not only add element on the top of the stack but also return the same object if added successfully.
        System.out.println(s.push("Rohan"));

        //To print the stack.
        System.out.println("Stack = "+s);
        //To search any element present in the stack.It returns offset and not index.
        //Basically index starts from the bottom element to the top element(starts with 0) whereas offset starts from the top element to the bottom element(starts with 1).
        System.out.println("Offset of Samir which is present in the stack : "+s.search("Samir"));
        //If any element is not present and you search then it will return -1.
        System.out.println("Offset of Arpitha which is not present in the stack : "+s.search("Arpitha"));
        //Stack also has one specific method "empty()" to check if a stack is empty or not.Is is same as "isEmpty()" method of Collection interface.
        System.out.println("Is stack empty : "+s.empty());

        //To print the element present at the top of the stack.
        System.out.println(s.peek());

        //Pop method is used to remove element present at the top of the stack.It also returns the same object which is removed.
        System.out.println(s.pop());
        System.out.println("Stack = "+s);
        //Other methods applicable for Vector are also applicable for stack including methods to remove elements.
        s.removeElementAt(2);
        System.out.println("Stack = "+s);
    }
}
