package com.techpassel.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Aman");
        a.add("Geetika");
        a.add("Samir");
        a.add("Swati");
        a.add("Manish");
        a.add("Aishwarya");
        ListIterator l = a.listIterator();
        //ListIterator is bidirectional.And it can be used to add or replace data also along with get and remove data.
        while (l.hasNext()){
            String s = (String) l.next();
            if(s == "Aishwarya")
                l.remove();
            if(s == "Manish")
                l.set("Ashish");
            if(s == "Swati")
                l.add("Jyotika");
        }
        //Don't use previous() and next() methods simultaneously otherwise there may be chance that they stuck in infinite loop and and reach to deadlock situation.
        while (l.hasPrevious())
            System.out.println("Element : "+l.previous()+", Previous element index : "+l.previousIndex()+", Next element index : "+l.nextIndex());

        l.forEachRemaining((val) -> System.out.println(val));



    }
}
