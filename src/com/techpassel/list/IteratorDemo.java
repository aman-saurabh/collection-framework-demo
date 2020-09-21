package com.techpassel.list;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i =0; i< 10; i++)
            l.add(i+1);

        Iterator<Integer> i = l.iterator();
        //Iterator can be used for any Collection Object hence it is also known as universal cursor.
        //With iterator we can get as well as remove elements
        while (i.hasNext())
        {
            int d = i.next();
            if(d%2 != 0)
                i.remove();
            if(d == 6)
                break;
        }
        System.out.println(l);
        //forEachRemaining() method was introduced in java 8.
        i.forEachRemaining(val -> System.out.println(val));
    }
}
