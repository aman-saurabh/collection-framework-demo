package com.techpassel.list;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        //Since TreeSet is the implementation class of NavigableSet interface
        NavigableSet<String> tt = new TreeSet();
        tt.add("Aman");
        tt.add("Samir");
        tt.add("Ravi");
        tt.add("Manish");
        tt.add("Geetika");
        tt.add("Swati");
        System.out.println(tt);
        System.out.println(tt.floor("Geetika"));
        System.out.println(tt.lower("Geetika"));
        System.out.println(tt.ceiling("Geetika"));
        System.out.println(tt.higher("Geetika"));

        //Returns NavigableSet in reverse order
        NavigableSet<String> n = tt.descendingSet();
        System.out.println(n);

        //Methods defined in SortedSet, not specific to NavigableSet
        SortedSet n1 = tt.headSet("Manish");
        System.out.println(n1);
        SortedSet n2 = tt.tailSet("Manish");
        System.out.println(n2);

        //These methods removes and return first and last element respectively.
        System.out.println(tt.pollFirst());
        System.out.println(tt.pollLast());
        System.out.println(tt);

    }
}
