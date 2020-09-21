package com.techpassel.list;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String >();
        System.out.println("Methods to add element");
        v.add("Saurabh");
        v.add(1,"Geetika");
        v.addElement("Aman");
        //Creating ArrayList just to show how to use addAll() method to add all elements of a Collection.
        ArrayList<String> a = new ArrayList<>();
        a.add("Samir");
        a.add("Manish");
        a.add("Ashish");
        v.addAll(a);
        //To show how to use ListIterator with Vector(Same can be applied for any List object)
        ListIterator e = v.listIterator();
        while(e.hasNext())
            System.out.println(e.next());
        //Same can be achieved using foreach loop also like below
        for (Object obj: v) {
            System.out.println(obj);
        }
        System.out.println("Vector = "+v);
        // If you print vector then it will give output as follows :
        // [Saurabh, Geetika, Aman, Samir, Manish, Ashish]
        System.out.println("First element : "+v.firstElement());
        System.out.println("Last element : "+v.lastElement());
        System.out.println("Element at index 4 using get method : "+v.get(4));
        System.out.println("Element at index 3 using elementAt method: "+v.elementAt(3));
        System.out.println("Size of vector : "+v.size());
        System.out.println("Capacity of vector : "+v.capacity());
        System.out.println("Is vector enpty : "+v.isEmpty());

        Object[] o = v.toArray();
        for (Object obj: o) {
            System.out.println(obj);
        }

        v.remove("Samir");
        System.out.println(v);
        v.removeElement("Ashish");
        System.out.println(v);

        v.remove(2);
        System.out.println(v);
        v.removeElementAt(1);
        System.out.println(v);

        v.retainAll(a);
        System.out.println(v);

        v.removeAllElements();
        //v.clear();
        //removeAllElements and clear both does same task - remove all elements hence commented clear method.
        System.out.println(v);
    }
}
