package com.techpassel.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10,10);
        for(int i =0; i< 10; i++)
            v.addElement(i+1);

        /*
         * Enumeration is only applicable for legacy classes i.e for Vector and Stack.
         * With enumeration We can only get elements.We cannot add,modify or delete elements.
         * Enumeration have only two methods - hasMoreElements() and nextElement().
         */
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }

}
